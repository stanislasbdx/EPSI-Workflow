package exercices.poo;

public class Cafetiere {
	public Cafetiere() {

	}

	public void remplirTasse(Tasse tasse) {
		tasse.cafe = new Cafe(TypeCafe.MOKA, tasse.quantiteCafeMax);
	}

	public void remplirTasse(Tasse tasse, TypeCafe typeCafe, double quantite) {
		tasse.cafe = new Cafe(typeCafe, quantite);
	}
}
