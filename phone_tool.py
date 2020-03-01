"""
phone_tool.py
====================================

Another core module of the framework. This class in an attempt to make a general object that can operate with adb
using all the things needed to inject a cert in an app to bypass ssl pinning using frida-gadjet

"""

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
    """
        PhoneTool class:
            -app_name:
                define the name of the app that you want to inject
            -ip:
                if the phone using adb via network, you can provide an ip address, at the moment this is not implemeted yet
    """

    def __init__(self, app_name, ip=None):
        self.app_name = app_name
        self.package_name = ''
        if ip:
            self.ip = ip

    def select_package(self):
        """
        List and search for the given package in the phone, then moves it in the download folder to be able of pulling it
        on the phones that has no root permissions
        """
        select_apk = "adb shell pm list packages -f | grep " + self.app_name
        output = send_cmd(select_apk)
        if output:
            self.package_name = output.split("=").pop(-1)
            print("Package name: ", self.package_name)
            o = output.rindex('=')
            cp = send_cmd("adb shell cp " + output[8:o]
                              + " /storage/emulated/0/Download/base_" + self.package_name + ".apk")
            pull_apk = send_cmd("adb pull /storage/emulated/0/Download/base_"+ self.package_name +".apk",
                                output_needed=False, cwd="apk")
            if pull_apk:
                print("Apk pulled successfully! File path is:", os.getcwd() + "/apk/base_" + self.package_name + ".apk")
                return os.getcwd() + "/apk/base_" + self.package_name + ".apk"
            print("Somenthing went wrong in retriving the selected package!")
            return False
        print("Cannot find the selected package!")
        return False

    @staticmethod
    def inject_mitm_cert():
        """
        Will be needed for rooted devices, freda needs that for hooking the certificate in the apps
        """
        cert_path = input("Enter mitmproxy folder path: ")
        inj = "adb push " + cert_path + "mitmproxy-ca-cert.cer /data/local/tmp/cert-der.crt"
        print(send_cmd(inj, output_needed=True))

    ''' generate a js string containig mitmproxy cert'''
    def _gen_js_cert_(self, cert_path = None):
        if cert_path:
            with open(cert_path + "mitmproxy-ca-cert.cer", 'r') as file:
                lines = file.read().splitlines()
                last_line = lines[-1]
                js_style_cert = 'var cert = String.$new("'
                for l in lines:
                    if l == last_line:
                        break;
                    js_style_cert = js_style_cert + l + '\\n" + "'
                js_style_cert = js_style_cert + last_line + '");'
            with open("pinning.js", 'r') as pinning:
                lines = pinning.readlines()
                lines[27] = '\t' + js_style_cert + '\n'
                return lines;


    def generate_pinning_script(self, renew = False):
        """
        This function modify on the fly the pinning script for frida with the given trusted cert

        Parameters
        ----------
        renew
            Regenerate the pinning script, generally used if you have changed the cert or reinstalled mitmproxy
        """
        cert_path = input("Enter mitmproxy folder path: ")
        if renew:
            lines = self._gen_js_cert_(cert_path)
            with open('pinning.js', 'r+') as pinning:
                pinning.seek(0)
                pinning.truncate()
                pinning.writelines(lines)
                print("Pinner renewed")
                return True
        else:
            lines = self._gen_js_cert_(cert_path)
            with open('pinning.js','r+') as pinning:
                created = False
                for l in pinning.readlines():
                    if l.find('var cert =') != -1:
                        print("Pinner already created!")
                        created = True
                if not created:
                    #with open('pinning.js', 'w'): pass
                    pinning.seek(0)
                    pinning.truncate()
                    pinning.writelines(lines)
                    print("Pinner created")
                return True

    @staticmethod
    def inject(libdir, arch, selected_library):
        """
        This function provides a correct version of gadjet and inject it into the apk

        Parameters
        ----------
        libdir
            Dir of the decompressed APK containing the app libraries
        arch
            The architecture of the phone where the app will be installed
        selected_library
            The library in which the user decided to inject frida-gadjet
        """
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
        """
        This function is used to get the apk, extract it, find the used libraries and architectures,
        than it calls the inject function with the correct statements in order to perform the frida gadjet injection
        and creates a new infected APK ready to be signed

        Parameters
        ----------
        pkg
            if a path to a package is provided, the method will operate on the given apk, otherwise it will ask for a path
        """
        # Get file
        if pkg is None:
            apk = input("[+] Enter the path of your APK: ")
        else:
            apk = pkg
        try:
            f = open(apk, 'r+')
        except:
            if apk:
                print("[+] I did not find the file at, " + str(apk))
            else:
                print("Error retrieving apk")
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

        arc = send_cmd("adb shell getprop ro.product.cpu.abi")
        if arc:
            print("Your current architecture is: ", arc)


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
        """
        This method is needed to resign the apk after the injection is done in order to be able to install it again,
        it creates a keystore if the user haven't done it yet, and the uses it to sign the new APK
        """
        if not os.path.exists(os.getcwd() + "/my-release-key.keystore"):
            print("You don't have a keystore, it will be created now...")
            keystore_gen = send_cmd("keytool -genkey -v -keystore my-release-key.keystore -alias alias_name -keyalg RSA -keysize 2048 -validity 10000",True)
            if keystore_gen:
                print(keystore_gen)
        else:
            print("You already have a keystore, if it's not working try to refactor it...")
        print("Proceeding signing APK")
        sign = send_cmd("jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore my-release-key.keystore base_" + self.package_name + "_infected.apk alias_name", True)
        if sign:
            print(sign)

    def pusher(self):
        """
        I know that's a funny name, but this function pushes (as ADB command) in to do phone the new infected app, and before doing it, it uninstalls the old version
        of the package
        """
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

    @staticmethod
    def frida_starter():
        """
        This method waits untill the infected app is ready and open on the phone and starts the frida hooking for SSL pinning bypass
        """
        #todo try to start the app from here
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