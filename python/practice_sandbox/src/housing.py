from urllib.request import urlopen
import sys
from pprint import pprint as pp
'''
    Author : Susmit Chatterjee
    Housing Analysis
'''

def caseSchillerIndex():
    data = quandl.get("FMAC/HPI")
    df = data['TX']
    return df.to_dict()             
 
if __name__ == "__main__":
    stub()
    