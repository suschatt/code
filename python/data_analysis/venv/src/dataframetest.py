import pandas as pd

rootDir=r'C:\Users\susmi\Documents\Code\code\python\data_analysis\venv\data\\'

nba = pd.read_csv(rootDir+'nba.csv')

print(nba.values)