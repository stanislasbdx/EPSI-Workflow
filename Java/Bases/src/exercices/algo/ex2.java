package exercices.algo;

import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) {
		System.out.println("Vies pour 158 gold coins : " + howMuchGold(158));
		System.out.println("Vies pour 3529 gold coins : " + howMuchGold(3259));

		rollTheDice(6, 1);
		rollTheDice(5, 12);

		bruteForce(new int[]{1, 2, 9, 7});
	}

	// 2.0
	private static int howMuchGold(int coins) {
		int _coins = coins;
		int lives = 0;

		while (_coins > 100) {
			_coins -= 100;
			lives++;
		}

		return lives;
	}

	// 2.1
	private static void rollTheDice(int firstDice, int secondDice) {
		if(firstDice + secondDice == 7) System.out.println("A zut tu a gagné");
		else System.out.println("Tu a perdu !");
	}

	// 2.2
	private static void bruteForce(int[] numbers) {
		int[] solution = new int[]{0, 0, 0, 0};

		for(int o = 0; o < numbers.length; o++) {
			for(int i = 0; i <= 9; i++) {
				if(i == numbers[o]) {
					System.out.print(i);
					solution[o] = i;
					break;
				};
			}
		}

		if(Arrays.toString(numbers).equals(Arrays.toString(solution))) System.out.println("Matrix Resurrections");
	}
}
