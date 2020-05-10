record ='M-26: Dempo SC (I-League-08) Mar-22, Salt Lake Stadium, Calcutta'

print(record)
match_number = record[0:4]
opponent = record[record.find(":")+1:record.find("(")].strip()
tournament = record[record.find("(")+1:record.find(")")].strip()
date = record[record.find(")")+1:record.find(",")].strip()
stadium= record[record.find(",")+1:].strip()
print(match_number)
print(opponent)
print(tournament)
print(date)
print(stadium)
