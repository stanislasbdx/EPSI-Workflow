package initiation;

public class Conditionnelle {
	public static void main(String[] args) {
		loopWhile();
		loopFor();
		loopSwitch();
	}

	private static void loopWhile() {
		int i = 0;

		// While = Tant que
		while(i < 5) {
			System.out.println("Bonjour");
			i++;
		}
	}

	private static void loopFor() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	private static void loopSwitch() {
		int jour = 3;

		switch (jour) {
			case 1:
				System.out.println("Lundi");
				break;
			case 2:
				System.out.println("Mardi");
				break;
			case 3:
				System.out.println("Mercredi");
				break;
			default:
				System.out.println("Jour inconnu");
		}
	}
}
