package assignments;

import java.util.Scanner;

public class Assignment2 {

	/*
	 * 2. Convert a String to alternate case Ex: howareyou - HoWaReYoU
	 */
	static String convertToAlternate(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if(i%2==0) {
				temp += Character.toLowerCase(str.charAt(i));
			}else {
				temp += Character.toUpperCase(str.charAt(i));
			}
		}
		return temp;
	}
	
	//cannot do this with String as String is immutable
	static String convertToAlternateStringBuffer(String str) {
		StringBuffer stringBuffer= new StringBuffer(str);
		for (int i = 0; i < stringBuffer.length(); i++) {
			if(i%2==0) {
				stringBuffer.setCharAt(i, Character.toLowerCase(stringBuffer.charAt(i)));
			}else {
				stringBuffer.setCharAt(i, Character.toUpperCase(stringBuffer.charAt(i)));
			}
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		System.out.println(convertToAlternate(str));
		System.out.println(convertToAlternateStringBuffer(str));
	}

}
