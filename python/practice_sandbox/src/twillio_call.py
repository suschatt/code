from twilio.rest import Client

account_sid = 'AC0f9f34365c17742398fecd6a63e4b5be'
auth_token = '8ebab73a3575125e1e2a85bc9dba4a40'

client = Client(account_sid,auth_token)

phone_list = ['+18035749876']

for pnumber in phone_list:
	call = client.calls.create(url='https://suschattphp.s3.amazonaws.com/voice.xml',to=pnumber,from_='+100000000',method='GET')
	print(call.sid)
	callList = client.calls.list()