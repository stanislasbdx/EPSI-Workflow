public enum Race {
	HUMAIN(18),
	TOGRUTA(3),
	KLACKONS(6),
	KLINGON(12),
	EPSILON(24),
	BORON(48),
	CASTAYBERT_STANISLAS(96);

	public final int ageAdulte;

	Race(int ageAdulte) {
		this.ageAdulte = ageAdulte;
	}
}
