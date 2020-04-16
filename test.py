from mitm_sniffer import MitmSniffer

#instantiate the class
sn = MitmSniffer()

# analize the packets with VirusTotal an Shodan
sn.packets_analysis('test.pcap')




