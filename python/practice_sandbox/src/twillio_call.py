from twilio.rest import Client

account_sid = 'xxx'
auth_token = 'xxx'

client = Client(account_sid,auth_token)

phone_list = ['+1123456789']

for pnumber in phone_list:
	call = client.calls.create(url='https://suschattphp.s3.amazonaws.com/voice.xml',to=pnumber,from_='+100000000',method='GET')
	print(call.sid)
	callList = client.calls.list()
