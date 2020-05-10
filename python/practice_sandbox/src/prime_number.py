from math import sqrt

def is_prime(x):
    if x<2:
        return False
    else:
        for i in range(2,int(sqrt(x)+1)):
            if x%i==0:
                return False
        return True

if __name__ == "__main__":
    primeNumbers = [x for x in range(101) if is_prime(x)]    
    print(primeNumbers)