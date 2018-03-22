from string import ascii_lowercase

def is_pangram(sentence):
    sentence = sentence.replace(" ","").lower()
    return all((ch in sentence) for ch in ascii_lowercase)
