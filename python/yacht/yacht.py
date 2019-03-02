# Score categories
# Change the values as you see fit

class Yacht:
    def score(self,dice):
        return 50 if allEqual(dice) else 0


class Counts:
    def __init__(self, n):
        self.n = n

    def score(self, dice):
        return len([d for d in dice if d == self.n]) * self.n


class FullHouse:
    def score(self, dice):
        s = list(set(dice))
        if len(s) is not 2:
            return 0
        first = dice.count(s[0])
        second = dice.count(s[1])
        return sum(dice) if len(s) == 2 and first in [2,3] and first + second == 5 else 0


class Sum():
    def score(self, dice):
        return sum(dice)


class FourOfKind:
    def score(self, dice):
        f = [x for x in set(dice) if dice.count(x) >= 4]
        return f[0] * 4 if len(f) > 0 else 0


class SmallStraight:
    def score(self, dice):
        dice.sort()
        return 30 if dice == [1,2,3,4,5] else 0

class BigStraight:
    def score(self, dice):
        dice.sort()
        return 30 if dice == [2,3,4,5,6] else 0


YACHT = Yacht()
ONES = Counts(1)
TWOS = Counts(2)
THREES = Counts(3)
FOURS = Counts(4)
FIVES = Counts(5)
SIXES = Counts(6)
FULL_HOUSE = FullHouse()
FOUR_OF_A_KIND = FourOfKind()
LITTLE_STRAIGHT = SmallStraight()
BIG_STRAIGHT = BigStraight()
CHOICE = Sum()


def score(dice, category):
    return category.score(dice)
from collections import Counter

def allEqual(l):
    return len(set(l)) <= 1
