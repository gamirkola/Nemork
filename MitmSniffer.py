from scapy.all import *
from scapy.utils import PcapWriter
import keyboard
from mitmproxy import *
import threading
from packettotal_sdk import packettotal_api, search_tools
import requests


load_layer("http")


# funzione che probabilmente andrà a mostrare anche più dettagliatamente i pacchetti
def show_packet(packet):
    if packet:
        packet.show()


class MitmSniffer:
    
    filter = ""
    interface = ""
    file_name = ""
    pkts = []
    break_program = False
    sniffing = threading.Thread()

    def __init__(self, filter, interface, file_name):
        self.filter = filter
        self.interface = interface
        self.file_name = file_name

    # scrittore di file pcap
    def pcap_generator(self):
        for i in self.pkts:
            wrpcap(self.file_name, i, append=True)

    # aggiunge un pacchetto alla lista di paccheti dello sniffer
    def packet_append(self, packet):
        show_packet(packet)
        self.pkts.append(packet)

    def sniffer(self):
        self.pkts=sniff(filter=self.filter, iface=self.interface, prn=self.packet_append)
    
    def on_press(self, key):
        if str(key) == "'q'":
            self.break_program = True
            return False

    def start_sniffing(self):
        print("press 'Q' to quit")
        self.sniffing = threading.Thread(target=self.sniffer, args=(), daemon=True)
        self.sniffing.start()
        while True:
            try:
                if keyboard.is_pressed('q'):
                    print("Grazie per avere sniffato con me ;)")
                    self.sniffing._running = False
                    self.pcap_generator()
                    break
                else:
                    pass
            except:
                pass

    def packets_analysis(self):
        api = search_tools.SearchTools('3d8201de3cef2b440e49644416fb0349')
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
    