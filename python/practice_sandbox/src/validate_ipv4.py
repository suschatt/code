import sys
ip = '192.-26.0.0'

if not (len(ip.split('.'))==4):
	print('Not a valid IP')
	sys.exit()


for x in ip.split('.'):
	if not (x.isnumeric()):
		print('Not a valid IP')
		sys.exit()
	elif (int(x)<0 or int(x)>255):
		print('Not a valid ip')
		sys.exit()
	
print('Valid IP')