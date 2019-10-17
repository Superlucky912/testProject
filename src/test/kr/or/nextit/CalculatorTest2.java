package kr.or.nextit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest2 {

	@Test
	public void testSum() {
		double result = Calculator.sum(4,5);
		assertTrue("9가 나와야 하는데..", result == 9);
	}

	@Test
	public void testSubtract() {
		double result = Calculator.subtract(3, 1);
		assertTrue("1이 나와야 하는데..", result == 2);
	}

	@Test
	public void testMultiply() {
		double result = Calculator.multiply(5, 9);
		assertTrue("45가 나와야 하는데..", result == 45);
	}

	@Test
	public void testDivide() {
		double result = Calculator.divide(90, 10);
		assertTrue("9가 나와야 하는데..", result == 9);
	}

}
