class Plateau:
    def __init__(self, Pions):
        self.echiquier = []
        self.Pions = Pions
        
        constructeursLignes = [ Pions.PIECES, self.pions, self.vide, self.vide ]

        for couleur in range(2):
            print(couleur)
            for construireLigne in constructeursLignes:
                self.echiquier.append(construireLigne(couleur))
            constructeursLignes.reverse()

    def pions(self, couleur):
        return [('P', couleur)] * self.Pions.TAILLE
    
    def vide(self, couleur):
        return [('',)] * self.Pions.TAILLE
    
    def print_echiquier(self):
        return print(self.echiquier)

    def get_echiquier(self):
        return self.echiquier