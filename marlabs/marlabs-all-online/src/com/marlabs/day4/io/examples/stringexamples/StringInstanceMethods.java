package com.marlabs.day4.io.examples.stringexamples;

public class StringInstanceMethods {

	public static void main(String[] args) {
		// each and every operation will result in a new memory location
		String string = new String("Aashutosh");

		try {
			char c = string.charAt(0);
			System.out.println(c);
			System.out.println(string.charAt(20));
		} catch (StringIndexOutOfBoundsException e) { // unchecked exception
			e.printStackTrace();
		}

		String s1 = "   Welcome to Strings Application  ";
		String s2 = s1.trim();
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		char charArray[] = s2.toCharArray();
		for (char c : charArray) {
			System.out.print(c);
		}
		System.out.println();

		String batchCode = "MYS18AJ005";
		String batchDomain = batchCode.substring(5);
		System.out.println(batchDomain);

		batchDomain = batchCode.substring(5, 7);
		System.out.println(batchDomain);

		/*
		 * This way you may get a NullPointerException and hence is not a best practice
		 * Assume, we get a null value from other method and batchDomain is null this
		 * will result in null.equals("AJ") -> NullPointerException
		 * 
		 * if (batchDomain.equals("AJ")) {
		 * System.out.println("Welcome to Advanced Java"); }
		 */

		// Best practice for comparing string is to call equals on constant value
		if ("AJ".equals(batchDomain)) {
			System.out.println("Welcome to Advanced Java");
		} else if ("DN".equals(batchDomain)) {
			System.out.println("Welcome to Dot Net");
		} else {
			System.out.println("Enter Correct batch details");
		}

		String somestr = " asd asd ";
		System.out.println(s2);
		String ss[] = s2.split("\\s"); // JDK 1.4 java.util.regex.*; "\\s" matches with whitespace
		for (String i : ss) {
			System.out.println(i);
		}

		StringBuffer sss = new StringBuffer("Aashutosh");
		String ssss = sss.toString();
		System.out.println(ssss);

		String a = "aaa";
		String b = "aaa";
		System.out.println(a.matches(b));

		String name = "Aashutosh";
		String surname = " Taikar";
		String fullName = name.concat(surname);
		System.out.println(fullName);
		String fullName1 = name + surname;
		System.out.println(fullName1);

		System.out.println(name.indexOf("s")); // first occurrence of "s"
		System.out.println(name.lastIndexOf("s")); // first occurrence of "s" from the end
		System.out.println(name.lastIndexOf("i")); // returns -1 if not found

		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.lastIndexOf(97)); // ASCII of 'a'

		String someText = "Java application is working fine and I love java.";
		System.out.println(someText.indexOf("Java", 10)); // ("searchTerm", from where to start searching)
		System.out.println(someText.lastIndexOf("Java", 10));
		System.out.println();

		System.out.println(someText.startsWith("Java"));
		System.out.println(someText.endsWith("java."));

		// int,boolean, char, float etc to String
		// way1 using String.valueOf(int)
		String height = String.valueOf(23);
		System.out.println(height);

		// way2 using wrapper class
		float x = 2.3f;
		Float floatval = x;
		height = floatval.toString();

		// Is it possible to compare contents of StringBuffer with String Object?
		String someName = "Aashutosh";
		StringBuffer otherName = new StringBuffer("Aashutosh");
		System.out.println(someName.equals(otherName) ? "String.equals(StringBuffer) works"
				: "String.equals(StringBuffer) doesn't work");
		// not possible with equals as it internally checks the datatype of the Object

		// possible with contentEquals JDK 1.4
		System.out.println(someName.contentEquals(otherName) ? "String.contentEquals(StringBuffer) works"
				: "String.contentEquals(StringBuffer) doesn't work");

		String str1 = "Welcome to java application";
		String str2 = str1.replace(" ", "%20"); // using normal replace
		String str3 = str1.replaceAll("\\s", "%20"); // using regex \\s is for white space
		System.out.println(str2);
		System.out.println(str3);

	}

}
