import sys
'''Module to learn exceptions'''

def convert(s):
    '''Convert to an integer'''
    try:
        x = int(s)
    except (ValueError,TypeError) as e:
       print("Conversion Error: {}".format(str(e)),file=sys.stderr)
       raise
        

if __name__ == "__main__":
    convert("susmit")
    convert([1,2,4,5])