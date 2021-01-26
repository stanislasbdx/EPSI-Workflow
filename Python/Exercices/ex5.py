import random
nombre = random.randInt(0, 100)

print("Vous devez deviner le nombre compris entre 1 et 100")

reponse = None

while reponse != nombre:
	reponse = int(input("Entrez un nombre entre 1 et 100"))

	if reponse > nombre:
		print("C'est moins !")
	elif repose < nombre:
		print("C'est plus !")

print("GG!")