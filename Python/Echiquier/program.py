TAILLE = 8
THEME_CLAIR = 0
LETTRES = "PRNBQK"
PIECES = [ "♟♜♞♝♛♚", "♙♖♘♗♕♔" ]
CASES = [" ", "█"]

def vide(couleur):
    return [('',)] * TAILLE

def pions(couleur):
    return [('P', couleur)] * TAILLE

def pieces(couleur):
    SEQUENCE = LETTRES[1:]
    return [ (SEQUENCE[i if i<len(SEQUENCE) else TAILLE-i-1], couleur)
             for i in range(TAILLE)
    ]


echiquier = []
constructeursLignes = [ pieces, pions, vide, vide ]

for couleur in range(2):
    for construireLigne in constructeursLignes:
        echiquier.append(construireLigne(couleur))
    constructeursLignes.reverse()      

print(echiquier)


def interligne(ligne, motif0, motif1):
    return "  " + 4 * (motif0 * 4 + motif1 * 4) if ligne%2 == 0 \
      else "  " + 4 * (motif1 * 4 + motif0 * 4)


pieces = [ 
    { LETTRES[j] : PIECES[i][j] for j in range(len(LETTRES)) }    
    for i in range(2)
]

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
            ligne += bord + pieces[(THEME_CLAIR + couleur) % 2][lettre] + " " + bord
    print(ligne)
    sep = interligne(y + THEME_CLAIR, "▄", "▀")
print(interligne(TAILLE + THEME_CLAIR, " ", "▀"))