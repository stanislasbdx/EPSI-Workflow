package exercices.poo;

public class Cafe {
	String typeCafe;
	double quantiteLiquideMl;

	public Cafe() {
		typeCafe = String.valueOf(TypeCafe.MOKA);

		quantiteLiquideMl = 100;
	}

	public Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
		this.typeCafe = String.valueOf(typeCafe);
		this.quantiteLiquideMl = quantiteLiquideMl;
	}
}
