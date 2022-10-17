package exercices;

public class A2 {
	public static void main(String[] args) {
		tryCondition(true, false);
		tryCondition(false, true);
		tryCondition(false, false);
		tryCondition(true, true);
	}

	private static void tryCondition(boolean param1, boolean param2) {
		if(param1 || param2) {
			System.out.println("OUI");
		}
		else {
			System.out.println("NON");
		}
	}
}
