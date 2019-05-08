import boto3

client = boto3.client('rekognition')

bucket = 'suschattphp'
photo = 'test.png'


response = client.detect_text(Image={'S3Object':{'Bucket':bucket,'Name':photo}})

print(response['TextDetections'][0]['DetectedText'])