import boto3
import json

client = boto3.client('comprehend')

response = client.batch_detect_sentiment(TextList = ['You are a fucking cunt'],LanguageCode = 'en')

print(response['ResultList'][0]['Sentiment'])