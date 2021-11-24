from pawn import Pawn
from rook import Rook
from knight import Knight
from bishop import Bishop
from queen import Queen
from king import King

TAILLE = 8
CASES = [" ", "█"]

def _vide(couleur):
        return [None] * TAILLE

def _pions(couleur):
    return [Pawn(0, 1+5*couleur, couleur) for i in range(TAILLE)]

def _pieces(couleur):
    SEQUENCE = [ Rook, Knight, Bishop, Queen, King ]
    return [ SEQUENCE[i if i<len(SEQUENCE) else TAILLE-i-1](i, couleur*7, couleur)
            for i in range(TAILLE)
    ]

def _interligne(ligne, motif0, motif1):
    return "  " + 4 * (motif0 * 4 + motif1 * 4) if ligne%2 == 0 \
      else "  " + 4 * (motif1 * 4 + motif0 * 4)

class ChessBoard:
    
    def __init__(self):
        self._echiquier = []
        constructeursLignes = [ _pieces, _pions, _vide, _vide ]

        for couleur in range(2):
            for construireLigne in constructeursLignes:
                self._echiquier.append(construireLigne(couleur))
            constructeursLignes.reverse()      

    def draw(self, theme):
        sep = _interligne(theme, "▄", " ")
        for y in reversed(range(TAILLE)):
            print(sep)
            ligne = f"{y+1} "
            for x in range(TAILLE):
                fond = (x + y + theme) % 2
                bord = CASES[fond]
                if self._echiquier[y][x] is None:
                    ligne += bord*4
                else:
                    ligne += bord \
                        + self._echiquier[y][x].get_piece().get_symbol(theme) \
                        + " " + bord
            print(ligne)
            sep = _interligne(y + theme, "▄", "▀")
        print(_interligne(TAILLE + theme, " ", "▀"))
        for col in range(8):
            print("   "+chr(ord('A')+col), end='')
        print()
    