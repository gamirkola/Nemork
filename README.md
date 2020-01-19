# Nemork

Network Mitm Framework for traffic analisys and vulnerabiity assesment

## Getting Started

You can use this program as a library in an external project, or use it stand alone, with some simple instruction in a .py file. 
The main file are MitmSniffer.py and VirusTotal.py, you can see an example of usage in test.py

### Prerequisites

I have to prepare the prerequisites section in a better way, i wiull do it after the testing e developemente are quite done… for now you just need python3 or above, mtmproxy framework, scapy and kamene, tqdm… 

```
pip install kamene
pip install mitmproxy
pip insstall scapy
pip install tqdm

```

### Installing

Better description will be given....

```

```
...

```

```

This is an example of output:

```
press 'Q' to quit sniffing
Enabling ip forwarding...
Setting up iptables...
net.ipv4.ip_forward = 1

Net options applied successfully!
Proxy server listening at http://*:8080
qThanks for sniffing with me ;)
file generation --> sniffing.pcap:
0it [00:00, ?it/s]
Scan request successfully queued
Please wait for the file report!
```

as you can see it also makes some changes to your OS environment to make the proxy work trasparently and in a correct way

## Deployment

This system will be used in general for forensics purposes, 


## Built With

* **[Mitmproxy](https://mitmproxy.org/) - The proxy used**
* **[Frida](https://frida.re/) - Bypass ssl pinning**
* **[Scapy/kamene](https://scapy.net/) - For the tcpdump like sniffing, kamene is only a py3 porting**

## Contributing

At the moment if you want to contribute in some way, you have to write to me.

## Authors

* **Mirko Gala** 
<!--
## License

## This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments
-->
