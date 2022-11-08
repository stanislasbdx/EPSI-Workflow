import java.util.ArrayList;
import java.util.List;

public class CapsuleDeSecour extends Vehicule {
	public List<Creature> passagers;
	public int nbMaximumPassager;
	public boolean isInSpace;

	public CapsuleDeSecour() {
		passagers = new ArrayList<Creature>();
		nbMaximumPassager = 3;
		isInSpace = false;
	}

	public boolean ajouterPassager(Creature creature) {
		if (passagers.size() < nbMaximumPassager) {
			passagers.add(creature);
			return true;
		}
		else {
			System.out.println("Il n'y a plus de place dans le vaisseau.");
			return false;
		}
	}

	public List<Creature> lanceCapsule() {
		isInSpace = true;
		return passagers;
	}
}
