def verify(isbn):
    isbn = isbn.replace("-","")
    if len(isbn) != 10 or \
            not isbn[0:9].isdigit() or \
            (isbn[9]!= 'X' and not isbn[9].isdigit()):
        return False

    psum = sum(10 if i==9 and d=='X' else (10-i)*int(d) for i, d in enumerate(list(isbn)))
    return psum % 11 == 0
