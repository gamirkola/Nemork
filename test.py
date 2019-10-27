from MitmSniffer import MitmSniffer

sn = MitmSniffer("host 192.168.0.151", "eth0", "test.pcap")
sn.start_sniffing()