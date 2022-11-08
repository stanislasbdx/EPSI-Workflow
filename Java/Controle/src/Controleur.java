public class Controleur {
	public Race race;

	public Controleur(Race race) {
		this.race = race;
	}

	public boolean verifierVaisseau(Vaisseau vaisseau) {
		boolean passengerChecking = true;

		if (!vaisseau.capitaine.isAdulte()) {
			System.out.println("Controleur: Capitaine, vous n'êtes pas un adulte ?");
			System.out.println("Capitaine: Oui.");
			passengerChecking = false;
		}

		if (vaisseau.passagers.size() > vaisseau.nbMaximumPassager) {
			System.out.println("Je sais pas faire beaucoup de maths, mais il me semble bien que vous êtes trop");
		}

		int klackons = 0;
		int humans = 0;
		for (Creature creature : vaisseau.passagers) {
			if (creature.race == Race.KLINGON && race != Race.KLINGON) {
				System.out.println("bIQottaHvIS, SoHvaD ponglIj'e', ghaH ghotvam'e' DaSovbej.");
				passengerChecking = false;
			}

			if (creature.race == Race.KLACKONS)
				klackons++;

			if (klackons > 1) {
				System.out.println("Désolé, cette navette est interdite au insectes, merci de descendre.");
				passengerChecking = false;
			}

			if (creature.race == Race.HUMAIN)
				humans++;

			if (creature.race == Race.HUMAIN && creature.nom.equals("Castaybert")) {
				System.out.println("Ton nom m'est familier, viens avec moi, on va vérifier tout cela");
				passengerChecking = false;
			}
		}

		if(humans % 2 != 0) {
			System.out.println("Bon, je peux vous compter sur les doigts d'une main impair, ça n'a pas de sens, descendez.");
		}

		return passengerChecking;
	}
}
