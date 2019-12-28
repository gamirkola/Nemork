#! /bin/sh

SSLKEYLOGFILE="$PWD/.mitmproxy/sslkeylogfile.txt"  mitmproxy --mode transparent --showhost

