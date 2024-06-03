package fr.epsi;

public class Calculator {
	public double calculate(double firstOperand, double secondOperand, Operation operation) {
		switch (operation) {
			case ADD:
				return firstOperand + secondOperand;
			case SUBTRACT:
				return firstOperand - secondOperand;
			case MULTIPLY:
				return firstOperand * secondOperand;
			case DIVIDE:
				if (secondOperand == 0) {
					throw new IllegalArgumentException("Division by zero");
				}
				return firstOperand / secondOperand;
			default:
				throw new IllegalArgumentException("Invalid operation: " + operation);
		}
	}
}