from scapy.all import *
from scapy.utils import PcapWriter
import keyboard
from mitmproxy import *
from multiprocessing import *
from packettotal_sdk import packettotal_api, search_tools
from tqdm import tqdm
import requests
import os
import settings


load_layer("http")

API_KEY = os.getenv("API_KEY")


# funzione che probabilmente andrà a mostrare anche più dettagliatamente i pacchetti
def show_packet(packet):
    if packet:
        packet.show()


class MitmSniffer:
    
    filter = ""
    interface = ""
    file_name = ""
    pkts = []

    def __init__(self, filter, interface, file_name):
        self.filter = filter
        self.interface = interface
        self.file_name = file_name

    # scrittore di file pcap
    def pcap_generator(self):
        print("generazione file --> "+ self.file_name +":")
        try:
            for i in tqdm(self.pkts):
                wrpcap(self.file_name, i, append=True)
            return True
        except:
            return False

    # aggiunge un pacchetto alla lista di paccheti dello sniffer
    def packet_append(self, packet):
        show_packet(packet)
        self.pkts.append(packet)

    def sniffer(self):
        sn = sniff(filter=self.filter, iface=self.interface, prn=self.packet_append)

    def start_sniffing(self):
        print("press 'Q' to quit", API_KEY)
        self.pkts = Manager().list()
        sniffing = Process(target=self.sniffer, args=self.pkts)
        sniffing.start()
        while True:
            try:
                if keyboard.is_pressed('q'):
                    print("Grazie per avere sniffato con me ;)")
                    sniffing.terminate()
                    self.pcap_generator()
                    break
                else:
                    pass
            except:
                pass


    def packets_analysis(self):
        api = search_tools.SearchTools(API_KEY)
        analysis = api.analyze(open('./'+self.file_name, 'rb'), pcap_name='test.pcap')
        print(analysis.status_code, analysis.json())
        # response = analysis.json()
        # pcap_id = response['id']
        # headers = {
        #     'x-api-key': '<3d8201de3cef2b440e49644416fb0349>',
        # }
        #
        # res = requests.get('https://api.packettotal.com/v1/pcaps/'+pcap_id+'/analysis', headers=headers)
        # print(pcap_id, res)

        response = api.search_by_pcap(open('test.pcap', 'rb'))

        print(response.status_code, response.json())
    