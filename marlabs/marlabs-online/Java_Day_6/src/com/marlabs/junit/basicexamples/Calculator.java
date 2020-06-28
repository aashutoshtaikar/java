package com.marlabs.junit.basicexamples;

public class Calculator {
	public int add(int a, int b) throws NegativeNumberException {
		// negative number not supported
		if (a < 0 || b < 0) {
			throw new NegativeNumberException("negative numbers not supported");
		}
		return a + b;
	}

	public int divide(int a, int b) throws NegativeNumberException, ArithmeticException {
		if (a < 0 || b < 0) {
			throw new NegativeNumberException("negative numbers not supported");
		}
		if (b <= 0) {
			throw new ArithmeticException("dont enter 0 for denom");
		}
		return a / b;
	}

}
