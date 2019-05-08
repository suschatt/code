x="susmit"
def loadCred():
	f = open("C:/secret.dat")
	for x in f.readlines():
		if(x.split("=")[0] == "ACCESS_KEY_ID"):
			access_key_id=x.split("=")[1]
		else:
			secret_acces_key=x.split("=")[1]
	return access_key_id,secret_acces_key