#!/usr/bin/python3.7

from mitm_sniffer import MitmSniffer
from phone_tool import PhoneTool

#select the app
app = input("insert the name of the app you want to inject: ")
#initialize a PhoneTool class with the selected app
pn = PhoneTool(app.strip())
#copy in a readable folder the apk
pkg = pn.select_package()
#inject the frida gadget in the app
pn.apk_operation(pkg)
#inject our cert in the phone
# pn.inject_mitm_cert()
#sign the infected app
pn.signer()
#push the new app in the phone
pn.pusher()
#initialize the MitmSniffer
sn = MitmSniffer("ip host 192.168.0.151", "eth0", "sniffing.pcap")
#start frida for ssl pinning
pn.frida_starter()
#start tcpdump like sniff with scapy and mitmproxy
sn.start_sniffing()
#analize the packets with virus total an shodan
sn.packets_analysis()


