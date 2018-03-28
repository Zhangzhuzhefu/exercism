def hey(phrase):
    phrase = phrase.strip()
    if phrase == "":
        return "Fine. Be that way!"
    asking = phrase.endswith("?")
    yelling = phrase == phrase.upper() and (phrase.isupper() or phrase.islower())
    if asking and yelling:
        return "Calm down, I know what I'm doing!"
    if asking:
        return "Sure."
    if yelling:
        return "Whoa, chill out!"
    else:
        return "Whatever."
