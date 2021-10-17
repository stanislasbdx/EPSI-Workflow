# TP POO Dates
#
# Multi-groupe
# 	- Stanislas CASTAYBERT
#	- Begüm CETIN
#	- Mathéo CARLIER
#	- Kilyan MAILLARD
#	- Tristan RADAELLI--QUILLACQ
#	- Antoine LASCOU

from ClassID import *
from ClassDate import *

signupTime = False

users = []

def createDate():
	d_Date = input('    Jour : ')
	try:
		day = int(d_Date)
		date = Date(day, 1, 1001)
	except ValueOutError:
		print("    /!\ Le jour doit être comprise entre 1 et 31.")
		return False
	except:
		print("    /!\ Veuillez entrez un chiffre/nombre.")
		return False

	d_month = input('    Mois : ')
	try:
		month = int(d_month)
		date = Date(day, month, 1001)
	except ValueOutError:
		print("    /!\ Le mois doit être comprise entre 1 et 12.")
		return False
	except:
		print("    /!\ Veuillez entrez un chiffre/nombre.")
		return False

	d_year = input('    Année : ')
	try:
		year = int(d_year)
		date = Date(day, month, year)

		return date
	except ValueOutError:
		print("    /!\ L'année doit être comprise entre 1000 et 9999.")
		return False
	except:
		print("    Erreur.")
		return False


while True:
	print("Saisissez la date d'aujourd'hui : ")
	signupDate = createDate()

	# SI la date n'est pas correcte
	if(signupDate == False):
		# On reboucle pour demander une nouvelle date.
		confirmDate = "N"
		print("La date est incorrecte.")
	# SINON SI la date est égale au 01/01/1999
	elif str(signupDate) == "01/01/9999":
		# On arrête la boucle pour terminer les inscription et on affiche les inscriptions entrées.
		print("\nFin des inscriptions")

		print("\nListe des inscriptions (rangée par numéro d'inscription) :")
		print('{:<10} {:<25} {:<25} {:<10}'.format("Numéro :", "Nom :", "Prénom :", "Date d'inscription :"))

		for cpt in range(len(users)):
			print('{:<10} {:<25} {:<25}'.format(users[cpt].id, (users[cpt].firstName).upper(), (users[cpt].lastName).upper()), users[cpt].signupDate)
	
		break
	else:
		# On affiche la date et on demance confirmation.
		print("La date d'aujourd'hui est le : " + str(signupDate))

		confirmDate = input("Confirmez-vous cette date ? (Répondre O pour oui ou N pour non) : ").upper()

		#SI la date est confirmée
		if confirmDate == "O":
			signupTime = True

			while signupTime:
				newSignup = input("Souhaitez-vous ajouter une nouvelle inscription aujourd’hui ? (Répondre O pour oui ou N pour non) : ").upper()

				if newSignup == "O":
					print("Inscrivez le nouvel utilisateur.")
					firstName = input("    Nom : ")
					lastName = input("    Prénom : ")
					
					print("Saisissez la date d'inscription : ")
					userDate = createDate()

					# On vérifie que l'identité n'existe pas déjà dans notre répertoire. 
					alreadyExist = False
					i = 0
					while i != len(users):
						if firstName.upper() == users[i].firstName.upper():
							if lastName.upper() == users[i].lastName.upper():
								alreadyExist = True
						i+=1

					# SI l'identité n'existe pas dans le répertoire.
					if alreadyExist == False:
						confirmAddedUser = input("Confirmez-vous cette inscription ? (Répondre O pour oui ou N pour non) : ")
						if(confirmAddedUser == "O"):
							# On ajoute l'utilisateur à notre repertoire.
							users.append(ID(len(users), firstName, lastName, userDate))
							print("Inscription validée.")
						elif (confirmAddedUser == "N"):
							# On reboucle pour ajouter nouvelle inscription.
							pass
					
					# SINON SI l'identité existe déjà dans le répertoire.
					elif alreadyExist == True:
						print("Cette identité apparait déjà dans la liste des inscrits")
						
						continueSignIn = input("Voulez-vous poursuivre les inscriptions ? (Répondre O pour oui ou N pour non) : ")
						if(continueSignIn == "O"):
							# On reboucle pour ajouter une nouvelle inscription.
							pass
						elif (continueSignIn == "N"):
							# On stoppe la boucle pour redemander une autre date à l'utilisateur.
							signupTime = False


				elif newSignup == "N":
					# On stoppe la boucle pour redemander une autre date à l'utilisateur.
					signupTime = False

			else:
				pass
		elif confirmDate == "N":
			pass
		else:
			confirmDate = input("Réponse incorrecte. Répondre O pour oui ou N pour non : ").upper()
   