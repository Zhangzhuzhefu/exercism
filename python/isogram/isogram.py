def is_isogram(string):
    strip = string.replace(" ","").replace("-","").lower()
    charDict = {}
    for ch in strip:
        if charDict.get(ch) is None:
            charDict[ch] = 1
        else:
            charDict[ch] += 1
            if charDict[ch] > 1:
                return False
    return True
