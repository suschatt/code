import quandl
from datetime import datetime
from databaseutil import DBConnection
quandl.ApiConfig.api_key = 'VGyu39wByYSFEE1hXsDj'

def loadZillowData():
    conn = DBConnection()
    cursor = conn.cursor()
    cursor.execute("select zipcode from zipgeo where state in('NM')")
    zipcodeList=cursor.fetchall()
    for x in zipcodeList:
        zipcode=x[0]
        for key,value in dict(list(quandl.get(['ZILLOW/Z'+zipcode+'_MLPSF']).to_dict().values())[0]).items():
          params=(zipcode,str(key.date()),value)
          cursor.execute("INSERT INTO MLPSF(zipcode,date,value) VALUES(?,?,?)", params)
        print('Loaded for zipcode: ',zipcode)
    conn.commit()
    cursor.close()
    print('Zillow Data Loaded at : ',datetime.now())

if __name__ == '__main__':
    loadZillowData()