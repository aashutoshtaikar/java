package com.marlabs.day6.junit.basic;

@SuppressWarnings("serial")
public class NegativeNumberException extends RuntimeException {

	/**
	 * 
	 */
	public NegativeNumberException() {
		super();
	}

	/**
	 * @param message
	 */
	public NegativeNumberException(String message) {
		super(message);
	}

}
