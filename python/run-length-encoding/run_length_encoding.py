import re

def decode(string):
    codes = re.findall("(\d*)(\D)",string)
    return "".join([int(c)*w if c.isdigit() else w for c,w in codes])


def encode(string):
    words = []
    count = []
    for a in string:
        if not words or words[-1] != a:
            words.append(a)
            count.append(1)
        else:
            count[-1] += 1
    return "".join([("" if c == 1 else str(c))+w for w,c in zip(words, count)])
