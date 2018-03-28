import re

def decode(string):
    codes = re.findall("(\d*)(\D)",string)
    return "".join(
        int(c)*w if c.isdigit() else w for c,w in codes
    )

def encode(string):
    return "".join(
        str(len(ww))+w if len(ww)!=1 else w 
        for ww, w in re.findall(r'((\D)\2*)', string)
    )

