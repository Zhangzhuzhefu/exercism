def verify(isbn):
    isbn = isbn.replace("-","")
    if len(isbn) != 10 or not isbn[0:9].isdigit():
        return False
    firstPart = [int(d) for d in isbn[:9]]
    lastPart = isbn[9]
    if lastPart != 'X' and not lastPart.isdigit():
        return False
    sum9 = sum((10-i)*d for i, d in enumerate(firstPart))
    sum10 = sum9 + int(lastPart.replace('X', "10"))
    return sum10 % 11 == 0
