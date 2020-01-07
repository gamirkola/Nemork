#!/usr/bin/python3.7

from MitmSniffer import MitmSniffer
from PhoneTool import PhoneTool

#sn = MitmSniffer("ip host 192.168.0.191", "eth0", "sniffing_emulatore.pcap")
#sn.start_sniffing()
#sn.packets_analysis()
app = input("insert the name of the app you want to inject: ")
pn = PhoneTool(app.strip())
# pn.select_package()
# pn.apk_operation()
pn.inject_mitm_cert()