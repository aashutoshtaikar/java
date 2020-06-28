
package com.marlabs.junit.testclassesintro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.marlabs.junit.basicexamples.Calculator;
import com.marlabs.junit.basicexamples.NegativeNumberException;

public class CalculatorTestBeforeAfterClass {
	private static Calculator calculator = null;

	@BeforeClass
	public static void init() {
		System.out.println("im from init method");
		calculator = new Calculator();
	}

	@AfterClass
	public static void destroy() {
		System.out.println("im from destroy method");
		calculator = null;
	}

	@Test
	public void testAdd() {
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
		try {
			int result = calculator.add(-10, 20);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
			// fail();
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testAdd2() {
		try {
			int result = calculator.add(-10, -20);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	public void testDivide1() {
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
////			assertEquals(result, 0);
//		} catch (NegativeNumberException e) {
//			System.err.println(e.getMessage());
//		}
//	}
}
