#!/usr/bin/python3.7

from MitmSniffer import MitmSniffer
from PhoneTool import PhoneTool

#sn = MitmSniffer("ip host 192.168.0.191", "eth0", "sniffing_emulatore.pcap")
#sn.start_sniffing()
#sn.packets_analysis()
pn = PhoneTool()
pn.collect_apks()