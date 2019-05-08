import boto3


client = boto3.client('comprehend')

response = client.batch_detect_sentiment(TextList = ['I Love you'],LanguageCode = 'en')

print(response['ResultList'][0]['Sentiment'])