import java.util.ArrayList;
import java.util.List;

public class Vaisseau extends Vehicule {
	public Creature capitaine;
	public List<Creature> passagers;
	public List<CapsuleDeSecour> capsulesDeSecour;
	public int nbMaximumPassager;

	public Vaisseau() {
		capitaine = new Creature("Castaybert Stanislas", Race.HUMAIN, 42);

		passagers = new ArrayList<Creature>();

		capsulesDeSecour = new ArrayList<>();
		capsulesDeSecour.add(new CapsuleDeSecour());
		capsulesDeSecour.add(new CapsuleDeSecour());

		nbMaximumPassager = 10;
	}

	public Vaisseau(Creature capitaine, List<Creature> passagers, int nbMaximumPassager, int nbCapsulesDeSecour) {
		this.capitaine = capitaine;
		this.passagers = passagers;
		this.nbMaximumPassager = nbMaximumPassager;

		this.capsulesDeSecour = new ArrayList<CapsuleDeSecour>();
		for (int i = 0; i < nbCapsulesDeSecour; i++) {
			this.capsulesDeSecour.add(new CapsuleDeSecour());
		}
	}

	public boolean ajouterPassager(Creature creature) {
		if (passagers.size() < nbMaximumPassager) {
			passagers.add(creature);
			creature.afficherInformations();
			return true;
		}
		else {
			System.out.println("Il n'y a plus de place dans le vaisseau.");
			return false;
		}
	}

	public void ajouterPassagerClandestin(Creature creature, int potDeVin) {
		passagers.add(creature);
	}

	public boolean ajouterPassagerCapsuleSecours() {
		Creature addedPassenger = passagers.get(0);
		CapsuleDeSecour capsuleDeSecour = capsulesDeSecour.get(0);

		if(addedPassenger == null || capsuleDeSecour == null || capsuleDeSecour.passagers.size() >= capsuleDeSecour.nbMaximumPassager)
			return false;
		else {
			capsuleDeSecour.ajouterPassager(addedPassenger);
			passagers.remove(0);

			return true;
		}
	}
}
