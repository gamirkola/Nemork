from scapy.all import *
from scapy.utils import PcapWriter
from pynput import keyboard
from mitmproxy import *
import threading

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
        pktdump = PcapWriter(self.file_name, append=True, sync=True)
        pktdump.write(self.pkts)

    # aggiunge un pacchetto alla lista di paccheti dello sniffer
    def packet_append(self, packet):
        show_packet(packet)
        self.pkts.append(packet)

    def sniff(self):
        self.pkts=sniff(filter=self.filter, iface=self.interface, prn=self.packet_append)
    
    def on_press(self, key):
        if str(key) == "'q'":
            self.break_program = True
            return False

    def stop_sniffing(self):
        with keyboard.Listener(on_press=self.on_press) as listener:
            if self.break_program:
                self.sniffing._running = False
            listener.join()
        self.pcap_generator()
        
    # sniffing function
    def start_sniffing(self):
        print("press 'Q' to quit")
        self.sniffing = threading.Thread(target=self.sniff, args=(), daemon=True)
        self.sniffing.start()
        quit = threading.Thread(target=self.stop_sniffing, args=(), daemon=True)
        quit.start()
        quit.join()
        print("Grazie per avere sniffato con me ;)")
        
        
            

    