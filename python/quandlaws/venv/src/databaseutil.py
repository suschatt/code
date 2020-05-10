import sqlite3
#DB connection Utilitys

def DBConnection():
    sqliteConnection = sqlite3.connect(r'C:\Users\susmi\Documents\Code\code\python\quandlaws\venv\data\quandlre.db')
    return sqliteConnection