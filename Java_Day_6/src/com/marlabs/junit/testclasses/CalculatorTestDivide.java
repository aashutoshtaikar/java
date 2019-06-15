package com.marlabs.junit.testclasses;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.junit.basicexamples.Calculator;
import com.marlabs.junit.basicexamples.NegativeNumberException;

//for ordering the test cases according to method name
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTestDivide {
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

	// positive scenarios
	// ===================
	// setting timeout for 5 ms for this test case
	@Test(timeout = 30)
	public void testAdd() {
		try {
			int result = calculator.add(10, 20);
			assertEquals(30, result);
		} catch (NegativeNumberException e) {
			fail();
		}
	}

	// negative scenarios
	// ====================
	@SuppressWarnings("unused")
	@Test
	public void testAdd1() {
		try {
			int result = calculator.add(-10, 20);
		} catch (NegativeNumberException e) {
			// System.err.println(e.getMessage());
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
	public void testDivide() {
		try {
			int result = calculator.divide(20, 10);
			assertEquals(2, result);
		} catch (NegativeNumberException e) {
			fail();
		} catch (ArithmeticException e) {
			fail();
		}
	}

	@Test
	public void testDivide1() {
		try {
			int result = calculator.divide(20, 0);
			assertEquals(2, result);
		} catch (NegativeNumberException e) {
			fail();
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	@Test
	public void testDivide2() {
		try {
			int result = calculator.divide(20, -10);
			assertEquals(0, result);
		} catch (NegativeNumberException e) {
			System.err.println(e.getMessage());
		} catch (ArithmeticException e) {
			fail();
		}
	}

	// JUNIT 1.4 can use instead of try catch block
	@Ignore
	@SuppressWarnings("unused")
	@Test(expected = NegativeNumberException.class)
	public void testDivide3() {
		int result = calculator.divide(10, -10);
	}
}
