import java.util.ArrayList;
import java.util.List;

public class Vaisseau extends Vehicule {
	public Creature capitaine;
	public List<Creature> passagers;
	public List<CapsuleDeSecour> capsulesDeSecours;
	public int nbMaximumPassager;

	public Vaisseau() {
		capitaine = new Creature("Castaybert Stanislas", Race.HUMAIN, 42);

		CapsuleDeSecour cap1 = new CapsuleDeSecour();
		cap1.nbMaximumPassager = 10;

		CapsuleDeSecour cap2 = new CapsuleDeSecour();

		capsulesDeSecours = new ArrayList<>();
		capsulesDeSecours.add(cap1);
		capsulesDeSecours.add(cap2);
	}

	public Vaisseau(Creature capitaine, List<Creature> passagers, int nbMaximumPassager) {
		this.capitaine = capitaine;
		this.passagers = passagers;
		this.nbMaximumPassager = nbMaximumPassager;
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
		CapsuleDeSecour capsuleDeSecour = capsulesDeSecours.get(0);

		if(addedPassenger == null || capsuleDeSecour == null || capsuleDeSecour.passagers.size() >= capsuleDeSecour.nbMaximumPassager)
			return false;
		else {
			capsuleDeSecour.ajouterPassager(addedPassenger);
			passagers.remove(0);

			return true;
		}
	}
}
