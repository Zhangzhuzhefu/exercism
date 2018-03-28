import re

def decode(string):
    words = []
    count = []
    codes = re.findall("(\d*)([a-zA-Z\s])",string)
    zipped = [(int(c) if c.isdigit() else 1, w)for c,w in codes]
    return "".join(w*c for c,w in zipped)


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
