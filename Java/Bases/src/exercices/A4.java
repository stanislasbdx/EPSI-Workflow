package exercices;

public class A4 {
	public static void main(String[] args) {
		tryCondition(true);
	}

	private static void tryCondition(boolean param) {
		if (false) {}
		else if(param) {
			System.out.println("OUI");
		}
	}

}
