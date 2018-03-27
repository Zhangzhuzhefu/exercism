import re
import collections

def word_count(phrase):
    p = re.findall('([a-z0-1]+\'*[a-z0-9]+|[a-z0-9]+)', phrase.lower())
    return collections.Counter(p)
