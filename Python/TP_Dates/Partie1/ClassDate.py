from datetime import date

class NotIntError(Exception):
    pass

class ValueOutError(Exception):
    pass

class Date(object):

    def __init__(self, jour, mois, annee):
        self.jour = jour
        self.mois = mois
        self.annee = annee

    @property
    def jour(self):
        return self.__jour

    @property
    def mois(self):  
        return self.__mois

    @property
    def annee(self): 
        return self.__annee

    @jour.setter
    def jour(self, value):
        if value < 1 or value > 31 :
            raise ValueOutError()
        self.__jour = value

    @mois.setter
    def mois(self, value):
        if value < 1 or value > 12:
            raise ValueOutError()
        self.__mois = value

    @annee.setter
    def annee(self, value):
        if value < 1000 or value > 9999:
            raise ValueOutError()
        self.__annee = value

    def __str__(self):
       return str(self.jour).zfill(2) + '/' + str(self.mois).zfill(2) + '/' + str(self.annee)

    def __sub__(self, other):
        d0 = date(self.annee, self.mois, self.jour)
        d1 = date(other.annee, other.mois, other.jour)
        delta = d0 - d1
        age = int(delta.days//365.25)
        jours = int(delta.days%365.25)
        return age, jours
                













