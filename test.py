#!/usr/bin/python3.7

from MitmSniffer import MitmSniffer

sn = MitmSniffer("ip host 192.168.0.151", "eth0", "sniffing.pcap")
sn.start_sniffing()
#sn.packets_analysis()