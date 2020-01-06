'''this class in an attempt to makea general class that can operate with adb
using all the things needed to inject a cert in an app to bypass ssl pinning'''
from utils import *

class PhoneTool:

    def __init__(self, ip=None):
        if ip:
            self.ip = ip


    def collect_apks(self):
        pull_apk = "for i in $(adb shell pm list packages | awk -F':' '{print $2}'); do adb pull \"$(adb shell pm path $i | awk -F':' '{print $2}')\" ;done"
        if send_cmd(pull_apk, output_needed=False, cwd="apks"):
            print("Apks pulled successfully!")


