from twilio.rest import Client 
from twilio.twiml.messaging_response import Body, Message, Redirect, MessagingResponse
 
account_sid = 'XXX' 
auth_token = 'XXX' 
client = Client(account_sid, auth_token) 
 
response = MessagingResponse()
message = Message()
message.body('score')
response.append(message)
response.redirect('https://demo.twilio.com/welcome/sms/')

print(response)
