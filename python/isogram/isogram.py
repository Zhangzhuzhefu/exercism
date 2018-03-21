def is_isogram(string):
    strip = string.replace(" ","").replace("-","").lower()
    return all(strip.count(ch) ==1 for ch in strip)

