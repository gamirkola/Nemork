import os
import requests

API_KEY_VIRUS_TOTAL = os.getenv("API_KEY_VIRUS_TOTAL")

class VirusTotalApi:

    def __init__(self):
        self.api_key = os.getenv("API_KEY_VIRUS_TOTAL")
        self.base_url = 'https://www.virustotal.com/vtapi/v2/file/'
        self.params = {'apikey': self.api_key}

    '''made for resetting the params'''

    def default_params(self):
        self.params = {'apikey': self.api_key}

    '''method that sends a file to vt for scanning'''

    def scan(self, file_name):
        files = {'file': (file_name, open(file_name, 'rb'))}
        response = requests.post(self.base_url + 'scan', files=files, params=self.params)
        return response

    '''method that request a report for the given hash, if the opt all_info 
    is true it returns all the info provided by the restricted api'''

    def report(self, resource, all_info=False):
        self.params['resource'] = str(resource)
        if all_info:
            self.params['allinfo'] = 'true'
        response = requests.get(self.base_url + 'report', params=self.params)
        self.default_params()
        return response
