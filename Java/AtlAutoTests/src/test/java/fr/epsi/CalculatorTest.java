package fr.epsi;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	@Test
	public void testAddition() {
		Calculator calculator = new Calculator();
		double result = calculator.calculate(2.0, 3.0, Operation.ADD);
		assertEquals(5.0, result);
	}

	@Test
	public void testSubtraction() {
		Calculator calculator = new Calculator();
		double result = calculator.calculate(5.0, 2.0, Operation.SUBTRACT);
		assertEquals(3.0, result);
	}

	@Test
	public void testMultiplication() {
		Calculator calculator = new Calculator();
		double result = calculator.calculate(3.0, 4.0, Operation.MULTIPLY);
		assertEquals(12.0, result);
	}

	@Test
	public void testDivision() {
		Calculator calculator = new Calculator();
		double result = calculator.calculate(10.0, 2.0, Operation.DIVIDE);
		assertEquals(5.0, result);
	}

	@Test
	public void testDivisionByZero() {
		Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> calculator.calculate(10.0, 0.0, Operation.DIVIDE));
	}
}