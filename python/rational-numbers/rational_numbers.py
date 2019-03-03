from __future__ import division
from fractions import gcd


class Rational(object):
    def __init__(self, numer, denom):
        cd = gcd(numer, denom)
        self.numer = numer / cd
        self.denom = denom / cd

    def __eq__(self, other):
        return self.numer == other.numer and self.denom == other.denom

    def __repr__(self):
        return '{}/{}'.format(self.numer, self.denom)

    def __add__(self, other):
        newNumer = self.numer * other.denom + self.denom * other.numer
        newDenom = self.denom * other.denom
        cd = gcd(newNumer, newDenom)
        return Rational(newNumer/cd, newDenom/cd)

    def __sub__(self, other):
        newNumer = self.numer * other.denom - self.denom * other.numer
        newDenom = self.denom * other.denom
        cd = gcd(newNumer, newDenom)
        return Rational(newNumer/cd, newDenom/cd)

    def __mul__(self, other):
        newNumer = self.numer * other.numer
        newDenom = self.denom * other.denom
        cd = gcd(newNumer, newDenom)
        return Rational(newNumer/cd, newDenom/cd)

    def __truediv__(self, other):
        return self * Rational(other.denom, other.numer)

    def __abs__(self):
        return Rational(abs(self.numer), abs(self.denom))

    def __pow__(self, power):
        newNumer = self.numer ** power
        newDenom = self.denom ** power
        cd = gcd(newNumer, newDenom)
        return Rational(newNumer/cd, newDenom/cd)

    def __rpow__(self, base):
        return base ** (self.numer / float(self.denom))
