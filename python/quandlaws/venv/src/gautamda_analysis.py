import quandl
import requests
import json
from pprint import  pprint
import pandas as pd
#quandl key
quandl.ApiConfig.api_key = 'VGyu39wByYSFEE1hXsDj'
#call indicator web service
wsresponse = requests.get('https://s3.amazonaws.com/quandl-production-static/zillow/indicators.csv')
#parse the indicators
indict={}
def IndicatorCodeParse():
    for x in wsresponse.text.split('\n'):
        try:
            if(x.split('|')[1]!='CODE'):#ignore header
                indict.update ({ x.split('|')[0] : x.split('|')[1]})
        except IndexError:
            pass

def pullZillowData():
    with pd.ExcelWriter(r'C:\Users\susmi\Documents\Code\code\python\quandlaws\venv\data\final_data_78729.xlsx') as writer:
        for ind,code in indict.items():
            quandl.get(['ZILLOW/Z78729_'+code]).to_excel(writer,sheet_name=code)

if __name__ == '__main__':
    IndicatorCodeParse()
    pullZillowData()

