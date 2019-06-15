package com.marlabs.day6.junit.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.marlabs.day6.junit.basic.Calculator;
import com.marlabs.day6.junit.basic.NegativeNumberException;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		try {
			int result = calculator.add(10, 20);
			assertEquals(result, 30);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd1() {
		Calculator calculator = new Calculator();
		try {
			int result = calculator.add(-10, 20);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd2() {
		Calculator calculator = new Calculator();
		try {
			int result = calculator.add(-10, -20);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	public void testDivide1() {
		Calculator calculator = new Calculator();
		try {
			int result = calculator.divide(20, 10);
			assertEquals(result, 2);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

//	@SuppressWarnings("unused")
//	@Test
//	public void testDivide2() {
//		Calculator calculator = new Calculator();
//		try {
//			int result = calculator.divide(10, 0);
//		} catch (NegativeNumberException e) {
//			System.err.println(e.getMessage());
//		}
//	}
}
