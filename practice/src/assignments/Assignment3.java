package assignments;

import java.util.Scanner;

public class Assignment3 {

	/* 3. Count the upper case & lower case letters in a string */
	static String upperLowCaseCount(String str) {
		int lowerCaseCount = 0, upperCaseCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upperCaseCount++;
			}
			else {
				lowerCaseCount++;
			}
		}
		
		return new String("Upper Case Count:" + upperCaseCount + "\nlower case count:" + lowerCaseCount);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:");
		String str = scanner.nextLine();
		scanner.close();
		System.out.println(upperLowCaseCount(str));
	}
}
