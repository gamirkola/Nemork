"""
mitm_sniffer.py
====================================
One of the core module of my project, here we initialize mitmproxy with the paramater given in the constructor
and scapy tcpdump like sniffing. Before doing it, i've made some function to set the proper network parameter on the machine where the
program is executed, like iptables and the main API for Shodan and VirusTotal

"""
from scapy.all import *
from tqdm import tqdm
from shodan import Shodan
from virus_total_api import VirusTotalApi
import sys, os, requests, keyboard, settings
from utils import send_cmd, json_writer


load_layer("http")
scapy.config.ipv6_enabled = False
API_KEY_PACKET_TOTAL = os.getenv("API_KEY_PACKET_TOTAL")
API_KEY_SHODAN = os.getenv("API_KEY_SHODAN")



class MitmSniffer:
    """
        MitmSniffer class:
            -filter:
                define what tcpdump like filter you want to implement
            -interface:
               on which interface you want to work
            -file_name:
               the name of the pcap file were sniffed data will be saved
            -pkts:
               internal packet list
    """

    def __init__(self, filter, interface, file_name):
        self.filter = filter
        self.interface = interface
        self.file_name = file_name
        self.pkts = []


    def pcap_generator(self, pkt_list = None):
        """
        Return True if the function can create a pcap with the given list,
        else you can optionally pass to it a list and it will try to generate the relative pcap

        Parameters
        ----------
        self
            An instance of the class where there is a fulfilled pkts list, usually no one needs to define it
        pkt_list
            A list of tcpdump like capture, if it is not defined the function tries to use the internal
            list of the class
        """
        result = False
        if pkt_list:
            try:
                for i in tqdm(pkt_list, desc="file generation --> {}".format(self.file_name)):
                    wrpcap(self.file_name, i, append=True)
                result = True
            except:
                result = False
        else:
            try:
                for i in tqdm(self.pkts, desc="file generation --> {}".format(self.file_name)):
                    wrpcap(self.file_name, i, append=True)
                result = True
            except:
                result = False
        return result

    def hostname_resolver(self, hostname):
        """
        Return the first ip solved by gethostbyname function of python

        Parameters
        ----------

        hostname
            A string containing the URI that you want to resolve
        """
        try:
            return socket.gethostbyname(hostname)
        except socket.error:
            return 0


    def evidence_extractor(self, data):
        """
        Return a dictionary that contains all the evidence extracted by the given
        VirusTotal report like json

        Parameters
        ----------

        data
            JSON like object returned by VirusTotalApi
        """
        evidence = {}
        if 'additional_info' in data:
            if data.get('additional_info').get('embedded_domains') is not None:
                for i, val in enumerate(data.get('additional_info').get('embedded_domains')):
                    evidence['domain' + str(i)] = val
            if data.get('additional_info').get('embedded_ips') is not None:
                for i, val in enumerate(data.get('additional_info').get('embedded_ips')):
                    evidence['ip' + str(i)] = val
            if data.get('additional_info').get('wireshark') is not None:
                if data.get('additional_info').get('wireshark').get('dns') is not None:
                    for i, val in enumerate(data.get('additional_info').get('wireshark').get('dns')):
                        evidence['dns' + str(i)] = val[0]
            if data.get('additional_info').get('embedded_urls') is not None:
                for i, val in enumerate(data.get('additional_info').get('embedded_urls')):
                    evidence['url' + str(i)] = val
        return evidence


    """verify and set the network options"""

    def set_net_opt(self):
        """
        Return true if it can set in a proper way all the net option needed to run mitmproxy correctly
        """
        print("Enabling ip forwarding...")
        enable_ip_forwarding = "sysctl -w net.ipv4.ip_forward=1"
        disable_icmp_redirects = "sysctl -w net.ipv4.conf.all.send_redirects=1"
        print("Setting up iptables...")
        nat_port_80 = "iptables -t nat -A PREROUTING -i " + self.interface + " -p tcp --dport 80 -j REDIRECT --to-port 8080"
        nat_port_443 = "iptables -t nat -A PREROUTING -i " + self.interface + " -p tcp --dport 443 -j REDIRECT --to-port 8080"
        if send_cmd(enable_ip_forwarding, False) and send_cmd(nat_port_80, False) and send_cmd(nat_port_443, False) and send_cmd(disable_icmp_redirects, False):
            return True
        else:
            return False

    def start_sniffing(self):
        """
        This function initializes the async sniffing of the traffic that comes from the selected ip
        then sets the net options calling the relative function and starts mitmproxy
        """
        print("press 'Q' to quit sniffing")

        """ set the proper net options """
        if self.set_net_opt():
            print ("Net options applied successfully!")
        else:
            print("Sorry, the program has some problems in setting up the propers network options!")
            sys.exit(1)

        sniffing = AsyncSniffer(filter=self.filter, iface=self.interface, prn=lambda x: (x.summary().rstrip('\r'), self.pkts.append(x)))
        sniffing.start()

        """start mitmproxy"""
        if send_cmd('SSLKEYLOGFILE="$PWD/mitmproxy/sslkeylogfile.txt"  mitmproxy --mode transparent --showhost', output_needed=False, new_shell=True):
            print("Mitmproxy started correctly")

        while True:
            try:
                if keyboard.is_pressed('q'):
                    sniffing.stop()
                    print("\nThanks for sniffing with me ;)")
                    self.pcap_generator()
                    break
                else:
                    pass
            except:
                pass

    def _shodan_report_(self, evidence):
        """
        Return True if the call to the shodan API has worked properly
        """
        try:
            api = Shodan(API_KEY_SHODAN)
            ips = []

            for key, val in tqdm(evidence.items(), desc="Hostname resolution"):
                if "ip" not in key:
                    ips.append(self.hostname_resolver(val))
                else:
                    ips.append(val)

            ip_info = {}
            for key, val in tqdm(enumerate(ips), desc="Wait for Shodan report", total=len(ips)):
                try:
                    ip_info['ip'+str(key)] = api.host(val)
                    json_writer("./shodan_report/ip"+str(key), ip_info['ip'+str(key)])
                except Exception as e:
                    print('Error: {}: {}'.format(val, e), end="\r")
                    pass
                time.sleep(2)

        except Exception as e:
            print('Error: {}'.format(e))
            sys.exit(1)
        return True

    def packets_analysis(self):
        """
        Return True if all the scans with VirusTotal and shodan API have success. It creates the report of virus total in JSON format
        in the root of the program, then saves the other results in vt_url_report and shodan_report folder shodan results
        """

        vt = VirusTotalApi()
        upload = vt.scan(self.file_name)
        print("Uploading the file...")
        json_writer("virus_total_upload_info", upload.json())
        if upload.status_code == 200 or upload.json()['response_code'] == 1:
            print((upload.json()['verbose_msg']).partition(',')[0] + "\nPlease wait for the file report!")
            report = vt.report(upload.json()['resource'], all_info=True)
            scan_started = time.time()
            while report.status_code != 200 or report.json()['response_code'] != 1:
                report = vt.report(upload.json()['resource'], all_info=True)
                now = time.time()
                time.sleep(10)
                print("Analyzing ({0})s".format(str(now - scan_started).partition('.')[0]), end='\r')
            for i in tqdm(range(30), desc="Retrieving the data"):
                time.sleep(1)
            report_ok = vt.report(upload.json()['resource'], all_info=True)
            print(report_ok.json()['verbose_msg'] + ", check in the program folder for complete report!")
            json_writer("virus_total_report", report_ok.json())
        else:
            print(upload.json()['verbose_msg'])

        """evidence extractor"""
        evidence = self.evidence_extractor(report_ok.json())
        try:
            json_writer("evidence", evidence)
            print("See the dir for a complete report fo the relevated evidence!")
        except Exception as e:
            print("Error: {}".format(e))

        """domain report of the exctracted domains visited"""
        for key, val in tqdm(evidence.items(), desc="Generating a report for each evidence"):
            url_report = vt.url_report(val, True, True)
            if url_report.status_code == 200:
                json_writer("./vt_url_report/report_" + key, url_report.json())

        """SHODAN API
        a future upgrade could be implementing search filter by becoming a Shodan member"""
        if self._shodan_report_(evidence):
            print("Shodan research terminated correctly!")
            return True
        else:
            return False



