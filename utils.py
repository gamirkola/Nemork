'''THIS CLASS CONTAINS ONLY GENERAL FUNCTION USED BY THE OTHER CLASSES'''
import json
import subprocess



'''terminal command send function'''


def send_cmd(cmd, output_needed=True, new_shell=False, cwd=None):
    if cmd and cmd != None:
        if new_shell:
            try:
                subprocess.check_call(['xterm', '-e', cmd])
                return True
            except subprocess.CalledProcessError:
                return False
        if output_needed:
            try:
                out = subprocess.check_output(cmd, shell=True, executable='/bin/bash').decode('utf-8')
                return out.strip()
            except subprocess.CalledProcessError as e:
                print(e)
                return False
        else:
            try:
                if cwd:
                    subprocess.run(cmd, cwd=cwd, shell=True)
                else:
                    subprocess.run(cmd, shell=True)
                return True
            except subprocess.CalledProcessError:
                return False
    else:
        return False

def cmp(a, b):
    return (a > b) - (a < b)

'''write a json obj with the given filename'''


def json_writer(file_name, json_obj):
    if file_name.find(".json") == -1:
        file_name = file_name + ".json"

    with open(file_name, 'w') as outfile:
        json.dump(json_obj, outfile, indent=4, sort_keys=True)
        return True