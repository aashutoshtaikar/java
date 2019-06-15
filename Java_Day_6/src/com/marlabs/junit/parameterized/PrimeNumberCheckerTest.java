package com.marlabs.junit.parameterized;

/*
Assume : http://junit.sourceforge.net/javadoc/org/junit/Assume.html
https://www.tutorialspoint.com/junit/junit_parameterized_test.htm
https://stackoverflow.com/questions/14082004/create-multiple-parameter-sets-in-one-parameterized-class-junit
*/

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.marlabs.junit.basicexamples.NegativeNumberException;
import com.marlabs.junit.basicexamples.PrimeNumberChecker;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	enum Type{PRIME,NOTPRIME, NEGATIVENOTPRIME};
	
	private Type type;
	
	private Integer numToCheck;
	private boolean result;
	private static PrimeNumberChecker primeNumberChecker;
	
	
	public PrimeNumberCheckerTest(Type type,Integer numToCheck, boolean expectedResult) {
		this.type = type;
		this.numToCheck = numToCheck;
		this.result = expectedResult;
	}
	
	
	@BeforeClass
	public static void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] {
			{Type.PRIME,1,true},
			{Type.PRIME,2,true},
			{Type.PRIME,3,true},
			{Type.PRIME,4,false},
			{Type.PRIME,6,false},
			{Type.NOTPRIME,1,false},
			{Type.NOTPRIME,2,false},
			{Type.NOTPRIME,3,false},
			{Type.NOTPRIME,4,true},
			{Type.NOTPRIME,6,true},
			{Type.NEGATIVENOTPRIME,-6, false}
			//For negative scenarios
			//value of expectedResult boolean for NEGATIVENOTPRIME doesn't matter as test case already knows what result is expected
		});
	}
	
	//positive scenarios
	@Test
	public void testIsPrime() {
		Assume.assumeTrue(type==Type.PRIME);
		System.out.println("input num:" + numToCheck);
		assertEquals(result, primeNumberChecker.isPrime(numToCheck));		
	}
	
	@Test
	public void testIsNotPrime() {
		Assume.assumeTrue(type==Type.NOTPRIME);
		System.out.println("input num:" + numToCheck);
		assertEquals(result, primeNumberChecker.isNotPrime(numToCheck));		
	}
	
	//negative scenarios
	@Test(expected = NegativeNumberException.class)
	public void testIsNotPrimeNegative() {
		Assume.assumeTrue(type==Type.NEGATIVENOTPRIME);
		System.out.println("input num:" + numToCheck);	
		primeNumberChecker.isNotPrime(numToCheck);
	}
	
}
