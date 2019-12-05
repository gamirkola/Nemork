from scapy.all import *
import keyboard
from mitmproxy import proxy, options
from mitmproxy.tools.dump import DumpMaster
from multiprocessing import *
from packettotal_sdk.search_tools import SearchTools
from tqdm import tqdm
import os
import settings
import json
from pathlib import Path
import sslkeylog
import requests


load_layer("http")

API_KEY_PACKET_TOTAL = os.getenv("API_KEY_PACKET_TOTAL")
API_KEY_VIRUS_TOTAL = os.getenv("API_KEY_VIRUS_TOTAL")


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


def json_writer(file_name, json_obj):
    if file_name.find(".json") == -1:
        file_name.append(".json")

    with open(file_name, 'w') as outfile:
        json.dump(json_obj.json(), outfile, indent=4, sort_keys=True)
        return True

class MitmSniffer:

    def __init__(self, filter, interface, file_name):
        self.filter = filter
        self.interface = interface
        self.file_name = file_name
        self.pkts = []

    '''func that creates a pcap with the internal pkt list'''
    def pcap_generator(self):
        print("generazione file --> "+ self.file_name +":")
        try:
            for i in tqdm(self.pkts):
                wrpcap(self.file_name, i, append=True)
            return True
        except:
            return False

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
        #sslkeylog.set_keylog('mitmproxykey.log')

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

        mitm_sniff = Process(target=self.mitm_sniffer)
        mitm_sniff.start()

        while True:
            try:
                if keyboard.is_pressed('q'):
                    print("Thanks for sniffing with me ;)")
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

        '''I'VE COMMENTED THIS BECOUSE AT THE MOMENT THE PACKET TOTAL API ARE NOT WORKING PROPERLY'''
        # api_packet_total = SearchTools(API_KEY_PACKET_TOTAL)
        #
        # upload = api_packet_total.search_by_pcap(pcap_file_obj=open(self.file_name, 'rb'))
        # print(upload.status_code, upload.json())

        '''VIRUS TOTAL API'''
        url = 'https://www.virustotal.com/vtapi/v2/file/scan'

        params = {'apikey': API_KEY_VIRUS_TOTAL}

        files = {'file': (self.file_name, open(self.file_name, 'rb'))}

        response = requests.post(url, files=files, params=params)

        print(response.json())








    