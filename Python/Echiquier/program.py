from Pions import *
from Plateau import *

TAILLE = 8
THEME_CLAIR = 0
CASES = [" ", "█"]

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