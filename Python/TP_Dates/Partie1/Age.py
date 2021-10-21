from ClassDate import *


def SaisieDate():
    ijour = input('    Jour : ')
    try:
        jour = int(ijour)
        date = Date(jour, 1, 1001)
    except ValueOutError:
        print("        Le jour doit être comprise entre 1 et 31.")
        return False
    except:
        print("        Veuillez entrez un chiffre/nombre.")
        return False
    imois = input('    Mois : ')
    try:
        mois = int(imois)
        date = Date(jour, mois, 1001)
    except ValueOutError:
        print("        Le mois doit être comprise entre 1 et 12.")
        return False
    except:
        print("        Veuillez entrez un chiffre/nombre.")
        return False
    iannee = input('    Année : ')
    try:
        annee = int(iannee)
        date = Date(jour, mois, annee)
        return date
    except ValueOutError:
        print("        L'année doit être comprise entre 1000 et 9999.")
        return False
    except:
        print("        Erreur.")
        return False

# Saisie et affichage de la date de naissance
print("Saisissez votre date de naissance :")
d1 = SaisieDate()

print("\nVotre date de naissance est le", d1)

print("\nSaisissez la date à laquelle vous souhaitez connaître votre âge :")
d2 = SaisieDate()

print("Le", d2, ", votre âge est de", (d2 - d1)[0], "ans et", (d2 - d1)[1], "jours (à un jour près).")

