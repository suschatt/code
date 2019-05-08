import load_credentials


if __name__ == "__main__":
	access_key_id,secret_access_key = load_credentials.loadCred()
	print(access_key_id)
	print(secret_access_key)