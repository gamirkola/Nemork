from scapy.all import *
import keyboard
from mitmproxy import proxy, options
from mitmproxy.tools.dump import DumpMaster
from multiprocessing import *
from packettotal_sdk.packettotal_api import PacketTotalApi
from tqdm import tqdm
import os
import settings
import json
from pathlib import Path
import sslkeylog


load_layer("http")

API_KEY = os.getenv("API_KEY")


'''function that shaw the packet, maybe it will be modified'''
def show_packet(packet):
    if packet:
        packet.show()

'''terminal command send function'''
def send_cmd(cmd):
    if cmd and cmd != None:
        p = subprocess.Popen(cmd, shell=True, executable='/bin/bash', stdout=subprocess.PIPE)
        out, err = p.communicate()
        return out, err
    else:
        return False


class MitmSniffer:

    def __init__(self, filter, interface, file_name):
        self.filter = filter
        self.interface = interface
        self.file_name = file_name
        self.pkts = []

    # scrittore di file pcap
    def pcap_generator(self):
        print("generazione file --> "+ self.file_name +":")
        try:
            for i in tqdm(self.pkts):
                wrpcap(self.file_name, i, append=True)
            return True
        except:
            return False

    '''add a packet to the program list'''
    def packet_append(self, packet):
        show_packet(packet)
        self.pkts.append(packet)

     '''verify the network options'''
    def net_opt(self):
        enable_ip_forwarding = "sysctl -w net.ipv4.ip_forward=1"
        send_cmd(enable_ip_forwarding)

        nat_port_80 = "iptables -t nat -A PREROUTING -i" + self.interface + "-p tcp --dport 80 -j REDIRECT --to-port 8080"
        send_cmd(nat_port_80)

        nat_port_443 = "iptables -t nat -A PREROUTING -i" + self.interface + "-p tcp --dport 443 -j REDIRECT --to-port 8080"
        send_cmd(nat_port_443)

    '''sniff the all the specified packet with scapy sniff function'''
    def sniffer(self):
        sn = sniff(filter=self.filter, iface=self.interface, prn=self.packet_append)

    '''start the real mitm using mitmproxy'''
    def mitm_sniffer(self):
        # os.system("export MITMPROXY_SSLKEYLOGFILE=/home/mirko/.mitmproxy/sslnemork.log")
        #sslkeylog.set_keylog('mitmproxykey.log')

        # set the proper net options
        self.net_opt()

        cmd = 'export SSLKEYLOGFILE="/home/mirko/.mitmproxy/sslkeylogfile.txt"'
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
                    print("Grazie per avere sniffato con me ;)")
                    sniffing.terminate()
                    mitm_sniff.terminate()
                    self.pcap_generator()
                    break
                else:
                    pass
            except:
                pass

    '''fnction that analyzes with various api the pcap file'''
    def packets_analysis(self):
        api = PacketTotalApi(API_KEY)

        upload = api.analyze(pcap_file_obj=open('./'+self.file_name, 'rb'), pcap_name=self.file_name)
        print(upload.status_code, upload.json())
        id = upload.json()['id']
        print("pcap_md5: ", id)
        analysis = api.pcap_analysis(id)

        print(analysis.status_code, analysis.json())
        with open('data.json', 'w') as outfile:
            json.dump(analysis.json(), outfile, indent=4, sort_keys=True)



    