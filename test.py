#!/usr/bin/python3.7

from MitmSniffer import MitmSniffer
from PhoneTool import PhoneTool

app = input("insert the name of the app you want to inject: ")
pn = PhoneTool(app.strip())
# pn.select_package()
# pn.apk_operation()
# pn.inject_mitm_cert()
# pn.signer()
# pn.pusher()
sn = MitmSniffer("ip host 192.168.0.151", "eth0", "sniffing.pcap")
# sn.start_sniffing()
# sn.packets_analysis()

pn.frida_starter()
sn.start_sniffing()




