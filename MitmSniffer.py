from kamene.all import *
from scapy.all import *
import keyboard
from mitmproxy import proxy, options
from mitmproxy.tools.dump import DumpMaster
from multiprocessing import *
from tqdm import tqdm
import os
import settings
import json
from pathlib import Path
import sslkeylog
import requests
import pyx
from shodan import Shodan
import pickle
from VirusTotalApi import VirusTotalApi
import dns.zone
import dns.ipv4
import os.path
import sys


load_layer("http")

API_KEY_PACKET_TOTAL = os.getenv("API_KEY_PACKET_TOTAL")
API_KEY_SHODAN = os.getenv("API_KEY_SHODAN")

'''function that shaw the packet, maybe it will be modified'''


def show_packet(packet):
    if packet:
        packet.show()


'''terminal command send function'''


def send_cmd(cmd):
    if cmd and cmd != None:
        try:
            out = subprocess.check_output(cmd, shell=True, executable='/bin/bash').decode('utf-8')
            if out.strip():
                print(out)
            return True
        except (subprocess.CalledProcessError, subprocess.OSerror):
            return False
    else:
        return False

def cmp(a, b):
    return (a > b) - (a < b)

'''write a json obj with the given filename'''


def json_writer(file_name, json_obj):
    if file_name.find(".json") == -1:
        file_name = file_name + ".json"

    with open(file_name, 'w') as outfile:
        json.dump(json_obj, outfile, indent=4, sort_keys=True)
        return True


class MitmSniffer:

    def __init__(self, filter, interface, file_name):
        self.filter = filter
        self.interface = interface
        self.file_name = file_name
        self.pkts = []

    '''func that creates a pcap with the internal pkt list'''

    def pcap_generator(self):
        print("file generation --> {}:".format(self.file_name))
        try:
            for i in tqdm(self.pkts):
                wrpcap(self.file_name, i, append=True)
            return True
        except:
            return False

    def hostname_resolves(self, hostname):
        try:
            return socket.gethostbyname(hostname)
        except socket.error:
            return 0

    '''function used to exctract relevant data from the given research'''

    def evidence_extractor(self, data):
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
        return evidence

    '''add a packet to the program list and show it'''

    def packet_append(self, packet):
        show_packet(packet)
        self.pkts.append(packet)

    '''verify and set the network options'''

    def set_net_opt(self):
        print("Enabling ip forwarding...")
        enable_ip_forwarding = "sysctl -w net.ipv4.ip_forward=1"
        print("Setting up iptables...")
        nat_port_80 = "iptables -t nat -A PREROUTING -i " + self.interface + " -p tcp --dport 80 -j REDIRECT --to-port 8080"
        nat_port_443 = "iptables -t nat -A PREROUTING -i " + self.interface + " -p tcp --dport 443 -j REDIRECT --to-port 8080"
        if send_cmd(enable_ip_forwarding) and send_cmd(nat_port_80) and send_cmd(nat_port_443):
            return "Net options applied successfully!"
        else:
            return "Sorry, the program has some problems in setting up the propers network options!"

    '''sniff the all the specified packet with scapy sniff function'''

    def sniffer(self):
        sn = sniff(filter=self.filter, iface=self.interface, prn=self.packet_append)

    '''start the real mitm using mitmproxy'''

    def mitm_sniffer(self):
        # os.system("export MITMPROXY_SSLKEYLOGFILE=/home/mirko/.mitmproxy/sslnemork.log")
        # sslkeylog.set_keylog('mitmproxykey.log')

        # set the proper net options
        print(self.set_net_opt())

        cmd = 'SSLKEYLOGFILE="/home/mirko/.mitmproxy/sslkeylogfile.txt"'
        send_cmd(cmd)

        ''' start mitmproxy for collecting as mitm http and https traffic with the related keys'''
        opts = options.Options(listen_host='0.0.0.0', listen_port=8080, mode='transparent',
                               confdir="/home/mirko/.mitmproxy/")
        pconf = proxy.config.ProxyConfig(opts)
        m = DumpMaster(opts)
        m.server = proxy.server.ProxyServer(pconf)

        m.run()


    def start_sniffing(self):
        print("press 'Q' to quit sniffing")

        ''' start the sniffer implemented with scapy '''
        self.pkts = Manager().list()
        sniffing = Process(target=self.sniffer, args=self.pkts)
        sniffing.start()

        mitm_sniff = Process(target=self.mitm_sniffer, args=self.pkts)
        mitm_sniff.start()
        while True:
            try:
                if keyboard.is_pressed('q'):
                    print("\nThanks for sniffing with me ;)")
                    sniffing.terminate()
                    mitm_sniff.terminate()
                    self.pcap_generator()
                    break
                else:
                    pass
            except:
                pass

    '''function that analyzes with various api the pcap file creating a json'''

    def packets_analysis(self):

        '''send a scan to vt api and return the report about the given file'''
        vt = VirusTotalApi()
        upload = vt.scan(self.file_name)
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
            for i in tqdm(range(30)):
                time.sleep(1)
            report_ok = vt.report(upload.json()['resource'], all_info=True)
            print(report_ok.json()['verbose_msg'] + ", check in the program folder for complete report!")
            json_writer("virus_total_report", report_ok.json())
        else:
            print(upload.json()['verbose_msg'])

        '''evidence extractor'''
        evidence = self.evidence_extractor(report_ok.json())
        print ("Relevated evidence for the uploaded file:\n", evidence)
        json_writer("evidence", evidence)

        '''domain report of the exctracted domains visited'''
        for key, val in tqdm(evidence.items(), desc="Generating a report for each evidence"):
            url_report = vt.url_report(val, True, True)
            if url_report.status_code == 200:
                json_writer("./url_report/report_" + key, url_report.json())

        '''SHODAN API
        a future upgrade could be implementing search filter by becoming a Shodan member'''

        try:
            api = Shodan(API_KEY_SHODAN)
            ips = []

            for key, val in tqdm(evidence.items(), desc="Hostname resolution"):
                if "ip" not in key:
                    ips.append(self.hostname_resolves(val))
                else:
                    ips.append(val)

            ip_info = {}
            for key, val in tqdm(enumerate(ips), desc="Wait for Shodan report", total=len(ips)):
                try:
                    ip_info['ip'+str(key)] = api.host(val)
                    json_writer("./shodan_report/ip"+str(key), ip_info['ip'+str(key)])
                except Exception as e:
                    print('Error: {}: {}'.format(val, e))
                    pass
                time.sleep(2)



        except Exception as e:
            print ('Error: {}'.format(e))
            sys.exit(1)

        # with PcapReader(self.file_name) as packet_list:
        #     for i, pkt in tqdm(enumerate(packet_list)):
        #         pkt.pdfdump("./pktdumps/dump{}".format(i))
