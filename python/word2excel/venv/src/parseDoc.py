import docx
import re
import string


d = docx.Document(r'C:\Users\susmi\Documents\Code\code\python\word2excel\venv\data\Matches-MB-19-20.docx')
f = open(r'C:\Users\susmi\Documents\Code\code\python\word2excel\venv\data\Matches-MB-19-20.csv','w')
f.write('MATCH_NUMBER,OPPONENT,TOURNAMENT,DATE,STADIUM,CITY,RESULT,SCORE,PLAYER_NUMBER,PLAYER_NAME,JERSEY_NUMBER,SUBSTITUTED\n')

global match_number,opponent,tournament,date,substituted

for data in d.paragraphs:
    record=data.text
    if len(record)==0:
        pass
    else:
        if(record[0].upper()=='M'):
            record1=record
            match_number=record[0:4]
            opponent = record[record.find(":") + 1:record.find("(")].strip()
            tournament = record[record.find("(") + 1:record.find(")")].strip()
            date = record[record.find(")") + 1:record.find(",")].strip()
            stadium = record[record.find(",") + 1:].strip()
        elif(record[0].upper()=='D' or record[0].upper()=='W' or record[0].upper()=='L'):
            result=record[0]
            score=record[1:].replace(',',';')
        elif(record[0].upper()=='P'):
            try:
                s='N/A'
                data = re.sub(r"[\t]+",'\t',record).split('\t')
                player_number = data[0]
                player_name = data[1]+" "+data[2]
                jersey_numberp = data[3]
                s=data[4]
            except (IndexError):
                pass
            f.write(match_number+","+opponent+","+tournament+","+date+","+stadium+","+result+","+score+","+player_number+","+player_name+","+jersey_numberp+","+s+"\n")
        elif(record[0].upper()=='S'):
            try:
                player_name=''
                jersey_numbers=''
                substituted='N/A'
                data = re.sub(r"[\t]+", '\t', record).split('\t')
                player_number = data[0]
                player_name = data[1] + " " + data[2]
                jersey_numbers = data[3]
                substituted = data[4]
                f.write(
                    match_number + "," + opponent + "," + tournament + "," + date + "," + stadium + "," + result + "," + score + "," + player_number + "," + player_name + "," + jersey_numberp + "," + substituted + "\n")
            except (IndexError):
                pass
                # print('BAD')
                # print(data)
                # print('BAD')


f.close()
print('DONE!!')









