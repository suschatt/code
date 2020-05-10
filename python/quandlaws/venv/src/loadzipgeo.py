from databaseutil import DBConnection
import json

def loadGeoData():
    conn = DBConnection()
    cursor = conn.cursor()
    with open(r'C:\Users\susmi\Documents\Code\code\python\quandlaws\venv\data\zipgeo.json') as json_file:
        data=json.load(json_file)
        for temp in data:
            params = (temp['fields']['zip'],temp['fields']['city'],temp['fields']['state'],temp['fields']['latitude'],temp['fields']['longitude'])
            cursor.execute("INSERT INTO zipgeo(zipcode,city,state,latitude,longitude) VALUES(?,?,?,?,?)", params)
    conn.commit()
    cursor.close()
    print('Location Data Loaded')

if __name__ == '__main__':
    loadData()