package com.marlabs.day5;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String stringExample = " Learning java is very easy with hands-on ";
		String str[] = stringExample.split(" ");
		System.out.println(Arrays.toString(str));
		System.out.println("length of str:" + str.length);

		StringTokenizer tokenizer = new StringTokenizer(stringExample);
		System.out.println("\nlength of strtok:" + tokenizer.countTokens());
		while (tokenizer.hasMoreTokens()) {
			System.out.print(tokenizer.nextToken() + " ");
		}
		System.out.println("\nlength of strtok:" + tokenizer.countTokens());

		stringExample = " Learning@ java@ is @very@ easy@ with @hands-on@ ";
		tokenizer = new StringTokenizer(stringExample, "@");
		while (tokenizer.hasMoreTokens()) {
			System.out.print(tokenizer.nextToken().trim() + " ");
		}

		// does not work??
		for (int i = 0; i < tokenizer.countTokens(); i++) {
			System.out.println(tokenizer.nextToken());
			System.out.println("asd");
		}
	}

}
