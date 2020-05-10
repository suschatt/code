import quandl
from databaseutil import DBConnection
from loadzipgeo import loadGeoData
from fetchZillowData import loadZillowData

quandl.ApiConfig.api_key = 'xxxx'

###Case Schiller Index
def caseSchillerIndex():
    conn = DBConnection()
    cursor = conn.cursor()
    for state, data in quandl.get("FMAC/HPI").items():
        for timeStamp, value in data.items():
            params = (state,str(timeStamp),str(value))
            #print(params)
            cursor.execute("INSERT INTO caseSchillerIndex(state,date,value) VALUES(?,?,?)",params)
    conn.commit()
    cursor.close()
    print('Case Schiller Index Loaded')

#Entry point
if __name__ == '__main__' :
    #loadGeoData()
    #caseSchillerIndex()
    loadZillowData()
