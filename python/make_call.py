from twilio.rest import Client
import time

account_sid = 'XXX'
auth_token = 'XXX'

client = Client(account_sid,auth_token)

phone_list = ['+9100000000']

for pnumber in phone_list:
	call = client.calls.create(url='https://s3.amazonaws.com/xxx/voice.xml',to=pnumber,from_='+100000000',method='GET')
	print(call.sid)
	callList = client.calls.list()
	
	
	

