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
