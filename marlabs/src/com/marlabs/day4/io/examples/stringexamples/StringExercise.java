package com.marlabs.day4.io.examples.stringexamples;

public class StringExercise {

	public static String mirrorImage1(String input) {
		StringBuffer temp = new StringBuffer(input);
		temp.reverse();
		return temp.toString();
	}

	public static String mirrorImage2(String input) {
		return input.concat("||").concat(new StringBuffer(input).reverse().toString());
	}

	/*
	 * input : {"A23@3QW","23QW34A2","3ASD4","#sd45sdf","ASDS@#2"} output : 40
	 */

	public static int getAllDigitsSum1(final String input[]) {
		int sum = 0;
		for (String s : input) {
			for (int i = 0; i < s.length(); i++) {
				if (Integer.valueOf(s.charAt(i)) >= Integer.valueOf('0')
						&& Integer.valueOf(s.charAt(i)) <= Integer.valueOf('9')) {
					sum += Character.getNumericValue(s.charAt(i));
				}
			}
		}
		return sum;
	}

	public static int getAllDigitsSum2(final String input[]) {
		int sum = 0;
		for (String s : input) {
			char ch[] = s.toCharArray();
			for (char c : ch) {
				if (Character.isDigit(c)) {
					// this will be wrong as it will implicitly be sum += (int)c; and
					// will take the ascii value
					// sum += c;

					// sum += c - '0'; //can also do this
					sum += Character.getNumericValue(c);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(mirrorImage2("EARTH"));
		String someStrings[] = { "A23@3QW", "23QW34A2", "3ASD4", "#sd45sdf", "ASDS@#2" };
		int sum = getAllDigitsSum2(someStrings);
		System.out.println(sum);
	}

}
