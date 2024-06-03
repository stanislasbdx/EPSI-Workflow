package fr.epsi;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first operand: ");
		double firstOperand = scanner.nextDouble();

		System.out.print("Choose operation (+, -, *, /): ");
		String operationString = scanner.next();
		Operation operation = Operation.valueOf(operationString);

		System.out.print("Enter second operand: ");
		double secondOperand = scanner.nextDouble();

		Calculator calculator = new Calculator();
		double result = calculator.calculate(firstOperand, secondOperand, operation);

		System.out.println(firstOperand + " " + operationString + " " + secondOperand + " = " + result);
	}
}