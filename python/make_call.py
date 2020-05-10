from twilio.rest import Client

account_sid = 'XXXXXXXXXXXX'
auth_token = 'XXXXXXXXXXXXXXX'

client = Client(account_sid,auth_token)

phone_list = ['123456789']

for pnumber in phone_list:
	try:
		call = client.calls.create(url='https://suschattphp.s3.amazonaws.com/voice.xml',to=pnumber,from_='+12563644380',method='GET')
		print(call.sid)
		callList = client.calls.list()
	except:
		pass
