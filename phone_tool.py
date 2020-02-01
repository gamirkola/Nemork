'''this class in an attempt to make a general class that can operate with adb
using all the things needed to inject a cert in an app to bypass ssl pinning'''

from utils import *
import lief
import zipfile
import shutil
import tempfile
import os
import pathlib
import requests
import re
from xtract import xtract
import time

'''main android architectures'''
gadget_architecture = {
    "arm64": "android-arm64.so",
    "arm64-v8a": "android-arm64.so",
    "armeabi": "android-arm.so",
    "armeabi-v7a": "android-arm.so",
    "x86": "android-x86.so",
    "x86_64": "android-x86_64.so"
}


class PhoneTool:

    def __init__(self, app_name, ip=None):
        self.app_name = app_name
        self.package_name = ""
        '''ip is not used but will be neede for a future upgrade'''
        if ip:
            self.ip = ip

    '''list and search for the given package in the phone, then moves it in the download folder to be able of pulling it'''
    def select_package(self):
        select_apk = "adb shell pm list packages -f | grep " + self.app_name
        output = send_cmd(select_apk)
        if output:
            self.package_name = output.split("=").pop(-1)
            print("Package name: ", self.package_name)
            cp = send_cmd("adb shell cp " + output.partition("=")[0].strip("package:")
                              + "apk /storage/emulated/0/Download/base_" + self.package_name + ".apk")
            pull_apk = send_cmd("adb pull /storage/emulated/0/Download/base_"+ self.package_name +".apk",
                                output_needed=False, cwd="apk")
            if pull_apk:
                print("Apk pulled successfully! File path is:", os.getcwd() + "/apk/base_" + self.package_name + ".apk")
                return os.getcwd() + "/apk/base_" + self.package_name + ".apk"

    '''will be needed for rooted devices, freeda needs that for hooking the certificate in the apps'''
    @staticmethod
    def inject_mitm_cert():
        cert_path = input("Enter .mitmproxy folder path: ")
        inj = "adb push " + cert_path + "mitmproxy-ca-cert.cer /data/local/tmp/cert-der.crt"
        print(send_cmd(inj, output_needed=True))

    '''this function provides a coorect version of gadjet and inject it into the apk'''
    @staticmethod
    def inject(libdir, arch, selected_library):
        # Get latests frida-gadgets
        #latest = requests.get(url="https://github.com/frida/frida/releases/latest")
        latest = requests.get(url="https://github.com/frida/frida/releases/tag/12.6.1")
        # Get stable frida-gadgets
        # latest = requests.get(url = "https://github.com/frida/frida/releases/tag/12.5.4")

        response = latest.content.decode('utf-8')
        '''the last version of frida is buggy so i've used the 12.6.1'''
        latestArch = re.findall(r'\/frida\/frida\/releases\/download\/.*\/frida-gadget.*\-android\-.*xz', response)
        url_gadget = ""
        for i in latestArch:
            if gadget_architecture[arch] in i:
                url_gadget = i

        print("[+] Downloading and extracting frida gadget for: " + arch)
        url = 'https://github.com' + str(url_gadget)
        r = requests.get(url)
        filename = "frida-gadget" + str(arch) + ".so.xz"
        with open(libdir / arch / filename, 'wb') as f:
            f.write(r.content)
        xtract(str(libdir / arch / filename))
        gadget_name = "libgdgt.so"
        os.rename(libdir / arch / filename[:-3], libdir / arch / gadget_name)
        os.remove(libdir / arch / filename)
        print(f"[+] Injecting {gadget_name} into {arch}/{selected_library} \n")
        libcheck_path = libdir / arch / selected_library
        libcheck = lief.parse(libcheck_path.as_posix())
        libcheck.add_library(gadget_name)
        libcheck.write(libcheck_path.as_posix())

    '''this func operates on the apk in order to be able to inject gadget, so decompress it, verify the libraries and then calls  inject'''
    def apk_operation(self, pkg = None):
        # Get file
        if pkg is None:
            apk = input("[+] Enter the path of your APK: ")
        else:
            apk = pkg
        try:
            f = open(apk, 'r+')
        except:
            print("[+] I did not find the file at, " + str(apk))
            exit()

        f = open(apk, 'r+')
        # stuff you do with the file goes here
        f.close()

        # Unzip
        workingdir = tempfile.mkdtemp(suffix='_lief_frida')

        print(f"[+] Unzip the {apk} in {workingdir}")
        zip_ref = zipfile.ZipFile(apk, 'r')
        zip_ref.extractall(workingdir)
        zip_ref.close()

        libdir = pathlib.Path(workingdir) / "lib"

        print("[+] Select the architecture of your system: ")

        arch = send_cmd("adb shell getprop ro.product.cpu.abi")
        if arch:
            print("Your current architecture is: ", arch)


        architectures = os.listdir(libdir)

        counter_lib = 0
        final_architectures = []
        for i in architectures:
            if i in gadget_architecture:
                counter_lib += 1
                final_architectures.append(i)
                print(f"{counter_lib}) {i}")

        print(f"{(counter_lib + 1)}) I don't know. Inject frida-gadget for all architectures (slower)\n")

        selected_arch = input("> ")

        print("\n[+] In with library do you want to inject?: \n ")

        if int(selected_arch) == (counter_lib + 1):
            libraries = os.listdir(libdir / final_architectures[0])
        else:
            libraries = os.listdir(libdir / final_architectures[int(selected_arch) - 1])

        counter = 0
        for lib in libraries:
            counter += 1
            print(str(counter) + ") " + lib)
        print("\n[+] Enter the number of the desired library: ")
        library = input("> ")
        selected_library = libraries[int(library) - 1]

        if int(selected_arch) == (counter_lib + 1):
            for arch in final_architectures:
                self.inject(libdir, arch, libraries[int(library) - 1])
        else:
            self.inject(libdir, final_architectures[int(selected_arch) - 1], libraries[int(library) - 1])

        print("[*] Removing old signature ")

        # Remove old signature
        shutil.rmtree(os.path.join(workingdir, "META-INF"))

        # Zip
        print("[+] APK Building...")
        apk_name = "base_"+ self.package_name +"_infected.apk"
        shutil.make_archive("new", 'zip', workingdir)
        shutil.move("new.zip", apk_name)

        print(f"[+] SUCCESS!! Your new apk is : {apk_name}. Now you should sign it.\n")

    '''function made to sign the apk, if it has already created a keystore, uses it, otherwise it will create a keystore'''
    def signer(self):
        if os.path.exists(os.getcwd() + "my-release-key.keystore"):
            keystore_gen = send_cmd("keytool -genkey -v -keystore my-release-key.keystore -alias alias_name -keyalg RSA -keysize 2048 -validity 10000",True)
            if keystore_gen:
                print(keystore_gen)
        else:
            print("You already have a keystore, if it's not working try to refactor it...")
        time.sleep(3)
        sign = send_cmd("jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore my-release-key.keystore base_" + self.package_name + "_infected.apk alias_name", True)
        if sign:
            print(sign)

    '''i know that's a funny name, this function pushes in to do phone the new infected app'''
    def pusher(self):
        '''before pushing the new app we have to uninstall the old version of it'''
        print("Trying to uninstall the original app from the phone...")
        un = send_cmd("adb uninstall " + self.package_name, True)
        if un:
            print(un)
        '''installation of the new apk'''
        print("Try to install the new infected app on the phone...")
        ins = send_cmd("adb install base_" +self.package_name + "_infected.apk", True)
        if ins:
            print(ins)

    '''this func listen when a infected app is ready and starts the frida hooking for SSL pinning bypass'''
    def frida_starter(self):
        #todo try to star the app from here
        print("Start the app on the phone...")
        pid = False
        while not pid:
            pid = send_cmd('frida-ps -U', output_needed=True)
        if pid:
            pid = concatenate_list_data(re.findall("[0-9]", pid))
            print("the process id is: ", pid)
            print("Starting frida-gadget on the injected app to bypass the SSL pinning...")
            if send_cmd("frida -U -l pinning.js " + pid + " --no-pause", False, True):
                print("Frida-gadget started properly!")
                return True
        else:
            print("Something went wrong; check if the desidered app is running on the phone...")
            return False