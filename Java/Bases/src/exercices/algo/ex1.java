package exercices.algo;

public class ex1 {
	public static void main(String[] args) {
		printHello();

		printSuite(3);
		printSuite(-5);

		printString("coucou");

		evenOddNumber(-4);
		evenOddNumber(7);
	}

	// 1.0
	private static void printHello() {
		System.out.println("J'ai compris comment faire une méthode !");
	}

	// 1.1
	private static void printSuite(int number) {
		if(number < 0) {
			for(int i = number; i != 0; i++) {
				System.out.println(number + " == " + i);
			}
		}
		else if (number > 0) {
			for(int i = number; i != 0; i--) {
				System.out.println(number + " == " + i);
			}
		}
	}

	// 1.2
	private static void printString(String text) {
		for(int i = 0; i < text.length(); i++){
			System.out.println(text);
		}
	}

	// 1.3
	private static void mathsdemerde() {}

	// 1.4
	private static void evenOddNumber(int number) {
		String type;
		String positive = number >= 0 ? "positif" : "négatif";

		if(number % 2 == 0) type = "pair";
		else type = "impair";

		System.out.println(number + " est " + positive + " et " + type);
	}
}
