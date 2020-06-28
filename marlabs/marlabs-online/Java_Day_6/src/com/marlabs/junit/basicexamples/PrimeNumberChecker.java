package com.marlabs.junit.basicexamples;

public class PrimeNumberChecker {
	
	public PrimeNumberChecker() {
		System.out.println("here");
	}
	
	public boolean isPrime(final Integer primeNumber) {
	      
		for (int i = 2; i < (primeNumber); i++) {
	          if (primeNumber % i == 0) {
	             return false;
	          }
	       }
	       return true;
	       
	}
	
	public boolean isNotPrime(final Integer primeNumber) {
	    if (primeNumber<0) {
			throw new NegativeNumberException("negative number not allowed");
		}  
		for (int i = 2; i < (primeNumber); i++) {
	          if (primeNumber % i == 0) {
	             return true;
	          }
	       }
	       return false;
	       
	}
	
//	public static void main(String[] args) {
//		PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();
//		System.out.println(primeNumberChecker.isPrime(99));
//	}
	
}
