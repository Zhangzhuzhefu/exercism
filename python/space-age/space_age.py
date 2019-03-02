
def r(n):
    return round(n, 2)


class SpaceAge(object):

    def __init__(self, seconds):
        self.seconds = seconds
        self.es = 31557600.0
        self.ey = seconds / self.es

    def on_earth(self):
        return r(self.ey)

    def on_mercury(self):
        return r(self.ey / 0.2408467)

    def on_venus(self):
        return r(self.ey / 0.61519726)

    def on_mars(self):
        return r(self.ey / 1.8808158)

    def on_jupiter(self):
        return r(self.ey / 11.862615)

    def on_saturn(self):
        return r(self.ey / 29.447498)

    def on_uranus(self):
        return r(self.ey / 84.016846)

    def on_neptune(self):
        return r(self.ey / 164.79132)
