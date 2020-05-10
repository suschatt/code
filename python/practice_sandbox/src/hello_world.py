import string
import random
'''
	Author : Susmit Chatterjee
	Purpose : This is a boilerplate code.
'''
str=''
for x in range(random.randint(1,10)):
	str  = str + random.choice(string.ascii_letters) 
print(str)