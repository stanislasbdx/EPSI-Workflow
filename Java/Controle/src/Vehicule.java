import java.util.List;

public abstract class Vehicule {
	public List<Creature> passager;
	public int nbMaximumPassager;

	public boolean ajouterPassager(Creature creature) {
		if(passager.size() < nbMaximumPassager) {
			passager.add(creature);
			return true;
		}
		else
			return false;
	}
}
