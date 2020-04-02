import os
import requests

API_KEY_VIRUS_TOTAL = os.getenv("API_KEY_VIRUS_TOTAL")

class VirusTotalApi:

    def __init__(self):
        self.api_key = API_KEY_VIRUS_TOTAL
        self.file_url = 'https://www.virustotal.com/vtapi/v2/file/'
        self.domain_url = 'https://www.virustotal.com/vtapi/v2/url/'
        self.params = {'apikey': self.api_key}

    '''made for resetting the params'''

    def default_params(self):
        self.params = {'apikey': self.api_key}

    '''method that sends a file to vt for scanning'''

    def scan(self, file_name):
        files = {'file': (file_name, open(file_name, 'rb'))}
        response = requests.post(self.file_url + 'scan', files=files, params=self.params)
        return response

    '''method that sends a file to vt for rescanning'''

    def rescan(self, resource):
        self.params['resource'] = str(resource)
        response = requests.post(self.file_url + 'rescan', params=self.params)
        self.default_params()
        return response

    '''method that request a report for the given hash, if the opt all_info 
    is true it returns all the info provided by the restricted api'''

    def report(self, resource, all_info=False):
        self.params['resource'] = str(resource)
        if all_info:
            self.params['allinfo'] = 'true'
        response = requests.get(self.file_url + 'report', params=self.params)
        self.default_params()
        return response

    '''method that request a report for the given url, if the opt all_info 
    is true it returns all the info provided by the restricted api'''

    def url_report(self, url, all_info=False, scan=False):
        self.params['resource'] = str(url)
        if all_info:
            self.params['allinfo'] = 'true'
        if scan:
            self.params['scan'] = 'true'
        response = requests.get(self.domain_url + 'report', params=self.params)
        self.default_params()
        return response

