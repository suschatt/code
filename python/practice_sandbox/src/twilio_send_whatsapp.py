from twilio.rest import Client 
from twilio.twiml.messaging_response import Body, Message, Redirect, MessagingResponse
 
account_sid = 'AC0f9f34365c17742398fecd6a63e4b5be' 
auth_token = '8ebab73a3575125e1e2a85bc9dba4a40' 
client = Client(account_sid, auth_token) 
 
response = MessagingResponse()
message = Message()
message.body('score')
response.append(message)
response.redirect('https://demo.twilio.com/welcome/sms/')

print(response)