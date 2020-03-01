#!/usr/bin/python3.7

from mitm_sniffer import MitmSniffer
from phone_tool import PhoneTool
import psutil
from pyfiglet import Figlet


def initialize_mitm_sniffer():
    filter = input("[+] Insert the filter for the sniffing in BPF like sintax: ")
    print("[+] On wich interface do you want to sniff?: ")
    addrs = psutil.net_if_addrs()
    counter = 0
    interfaces = []
    for k, v in addrs.items():
        print(str(counter) + ") " + k)
        interfaces.append(k)
        counter += 1
    interface = input("> ")
    interface = interfaces[int(interface)]
    file_name = input("[+] Insert the name of the pcap file where the packets sniffed will be saved: ")
    print("[*] Initializing the sniffing...")
    sn = MitmSniffer(filter, interface, file_name)
    return sn;

def analyze_packets(sn = None):
    analyze = input("[+] Do you want to make a vulnerability check on the sniffed packets? (y/n): ")
    if analyze == "y":
        if sn:
            sn.packets_analysis()
        else:
            print("Error in analyzing packets!")

if __name__ == '__main__':
    f = Figlet(font='univers')
    print(f.renderText('Nemork'))
    print("Welcome!!!")
    enable_phone_function = input("[+] Do you want to use Nemork with a phone? (y/n): ")
    if enable_phone_function == 'y':
        print("[*] starting phone tool functionality...")
        app = input("insert the name of the app you want to inject: ")
        pn = PhoneTool(app.strip())
        p_gen = input("[+] Create pinning script? (y/n): ")
        if p_gen == 'y':
            pn.generate_pinning_script(renew=False)
        pkg = pn.select_package()
        pn.apk_operation(pkg)
        pn.signer()
        pn.pusher()
        sn = initialize_mitm_sniffer()
        pn.frida_starter()
        sn.mitmproxy_starter()
        sn.start_sniffing()
        analyze_packets(sn)
    elif enable_phone_function == 'n':
        sn = initialize_mitm_sniffer()
        sn.mitmproxy_starter()
        sn.start_sniffing()
        analyze_packets(sn)