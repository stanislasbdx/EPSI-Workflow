package exercices.poo;

public class Tasse {
	public float quantiteCafeMax;

	public Cafe cafe;

	public Tasse(float quantiteMax) {
		quantiteCafeMax = quantiteMax;
	}

	public double boire(double quantite) {
		cafe.quantiteLiquideMl -= quantite;
		return cafe.quantiteLiquideMl;
	}

	public void boire() {
		cafe.quantiteLiquideMl = 0;
	}

}
