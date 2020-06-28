package com.marlabs.utilpgms;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random randomGen = new Random();
		int randVal = Math.abs(randomGen.nextInt() % 10);
		System.out.println(randVal);
		System.out.println(randomGen.nextFloat());
		System.out.println(randomGen.nextBoolean());
		System.out.println(randomGen.nextDouble());
		System.out.println(randomGen.nextGaussian());

		// another way
		System.out.println(Math.random()); // 0.0 - 1.0 double random values

	}

}
