# Nemork

Network Mitm Framework for traffic analisys and vulnerability assesment.

## Getting Started

You can use this program as a library in an external project, or use it stand alone, with some simple instruction in a .py file. 
The main file are mitm_sniffer.py and phone_tool.py, you can see an example of usage in test.py.

### Prerequisites

The main requirements for this framework are defined in requirements.txt file, you'll need to run the libraries under python3.
You can find some useful documentation in docs/build/html folder, as soon as possible i will host it on a web server including here the link.
In order to make Virustotal and Shodan API work properly you'll need to create a file in the root folder called .env where will be stored the API key in this format:


```
API_KEY_VIRUS_TOTAL = yourapikey
API_KEY_SHODAN = yourapikey
```
To guarantee the full support for Virustotal API you'll need the pro version of it.

### Usage

The framework is thought to be used stand alone or as a library in other application, so you can import the folder calling the main functions as described in test.py file, this file shows the correct flow of execution that you need to use in order to make all the function of the framework work properly, so 
but you can use also in a different ways depending on your needs.

```

```


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

This system is thought to be used in general for forensics and security purposes


## Built With

* **[Mitmproxy](https://mitmproxy.org/) - The proxy used**
* **[Frida](https://frida.re/) - Bypass ssl pinning**
* **[Scapy](https://scapy.net/) - For the tcpdump like sniffing**

## Contributing

At the moment if you want to contribute in some way, you have to write to me.

## Authors

* **Mirko Gala** 
<!--
## License

## This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments
-->
