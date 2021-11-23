TAILLE = 8
THEME_CLAIR = 0
CASES = [" ", "█"]

class Pions:
    PIECES = [ "♟♜♞♝♛♚", "♙♖♘♗♕♔" ]
    LETTRES = "PRNBQK"
    TAILLE = 8
    
    def __init__(self, taille):
        self.TAILLE = taille
 
    def pieces(self, couleur):
        SEQUENCE = self.LETTRES[1:]
        return [ (SEQUENCE[i if i<len(SEQUENCE) else self.TAILLE-i-1], couleur)
                for i in range(self.TAILLE)
        ]
    
    def get_pions(self, couleur):
        return [('P', couleur)] * self.TAILLE
    
    def get_pieces(self):
        return [ 
            { self.LETTRES[j] : self.PIECES[i][j] for j in range(len(self.LETTRES)) }    
            for i in range(2)
        ]


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

    def pions(couleur):
        return [('P', couleur)] * Pions.TAILLE
    
    def vide(couleur):
        return [('',)] * Pions.TAILLE
    
    def print_echiquier(self):
        return print(self.echiquier)

    def get_echiquier(self):
        return self.echiquier

def interligne(ligne, motif0, motif1):
    return "  " + 4 * (motif0 * 4 + motif1 * 4) if ligne%2 == 0 \
    else "  " + 4 * (motif1 * 4 + motif0 * 4)

Pions = Pions(8)

Plateau = Plateau(Pions)
echiquier = Plateau.get_echiquier()

sep = interligne(THEME_CLAIR, "▄", " ")
for y in reversed(range(TAILLE)):
    print(sep)
    ligne = f"{y+1} "
    for x in range(TAILLE):
        fond = (x + y + THEME_CLAIR) % 2
        bord = CASES[fond]
        if echiquier[y][x][0] == '':
            ligne += bord*4
        else:
            lettre, couleur = echiquier[y][x]
            print((THEME_CLAIR + couleur) % 2)
            ligne += bord + Pions.get_pieces[(THEME_CLAIR + couleur) % 2][lettre] + " " + bord
    print(ligne)
    sep = interligne(y + THEME_CLAIR, "▄", "▀")
print(interligne(TAILLE + THEME_CLAIR, " ", "▀"))