public class Creature {
	public String nom;
	public Race race;
	public int age;

	public Creature() {
		nom = "Castaybert";
		race = Race.HUMAIN;
		age = 42;
	}

	public Creature(String nom, Race race, int age) {
		this.nom = nom;
		this.race = race;
		this.age = age;
	}

	public boolean isAdulte() {
		return age >= race.ageAdulte;
	}

	public void afficherInformations() {
		System.out.println("Mon nom est " +  nom + ". Je suis un " + race + ". Je suis un " + (isAdulte() ? "adulte" : "enfant"));
	}
}
