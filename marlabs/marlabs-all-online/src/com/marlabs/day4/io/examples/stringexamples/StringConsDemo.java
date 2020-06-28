package com.marlabs.day4.io.examples.stringexamples;

import java.util.Scanner;

public class StringConsDemo {

	static void immutableVsMutable() {
		// Source:
		// https://stackoverflow.com/questions/16351555/printing-the-address-of-the-string-instances/35648773

		String x = "Aashutosh";
		// System.out.println(Integer.toHexString(x.hashCode())); //this could not be
		// what we really want(memory location)
		System.out.println(Integer.toHexString(System.identityHashCode(x))); // this is closer to a memory location
		x += " Taikar";
		System.out.println(Integer.toHexString(System.identityHashCode(x)));

		StringBuffer sb = new StringBuffer();
		sb.append("Aashutosh");
		System.out.println(Integer.toHexString(System.identityHashCode(sb)));
		sb.append(" Taikar");
		System.out.println(Integer.toHexString(System.identityHashCode(sb)));
	}

	static void equalsMethodImportance() {
		// String constru -- created in heap
		String name = new String("Aashutosh");
		System.out.println("Aashutosh" == name); // compares the memory location and not the contents of the string
		System.out.println("Aashutosh".equals(name)); // safe to use it with this type of constructor, compares the
														// memory loc if not equal, compares the contents

		// String literals constru -- object ref will point to the same memory location
		// for same contents
		String lname = "Aashutosh";
		System.out.println("Aashutosh" == lname);

		// intern() --return a string that has the same contents as this string, but is
		// guaranteed to be from a pool of unique strings.
		String other = lname.intern();

	}

	static void printStringDetails(String str) {
		int length = str.length();
		System.out.println("length:" + length);
		System.out.println("isEmpty:" + str.isEmpty());

		System.out.println(str.toString()); // toString method is over ridden in String class
		// System.out.println(str); //same as above
	}

	static void printStringBufferDetails(StringBuffer stringBuffer) {
		System.out.println(stringBuffer);
		System.out.println("length:" + stringBuffer.length());
		System.out.println("capacity: " + stringBuffer.capacity()); // 16 extra chars like a dynamic array
	}

	public static void main(String[] args) {
		// immutableVsMutable();
		// equalsMethodImportance();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter section num:");
		switch (scanner.nextInt()) {
		case 1:
			String str = new String(); // constru -1
			printStringDetails(str);
			break;
		case 2:
			String str1 = new String("Java Application"); // constru -2
			printStringDetails(str1);
			break;
		case 3:
			char ch[] = { 'J', 'a', 'v', 'a', 'a', 'a', 'p' };
			String str2 = new String(ch); // constr -3
			printStringDetails(str2);
			break;
		case 4:
			char chx[] = { 'J', 'a', 'v', 'a', 'a', 'a', 'p' };
			String str3 = new String(chx, 4, 3); // constr -4
			printStringDetails(str3);
			// String str31 = new String(ch, 4, -2); //StringIndexOutOfBoundsException
			// printStringDetails(str4);
			break;
		case 5:
			StringBuffer stringBuffer = new StringBuffer(); // StringBuffer --> mutable object
			stringBuffer.append("Aashutosh");
			stringBuffer.append(" Taikar");
			printStringBufferDetails(stringBuffer);

			// Convert mutable object into immutable object
			String str4 = stringBuffer.toString(); // way1 // constr -5
			String str41 = new String(stringBuffer); // way2 //constr -6
			break;
		case 6:

			break;
		case 7:
			StringBuilder stringBuilder = new StringBuilder("Aashutosh"); // mutable and same as StringBuffer only
																			// diff->
			// not threadsafe
			stringBuilder.append(" Taikar");
			break;

		case 8:
			String name = "Aashutosh";
			String internString = name.intern();
			System.out.println(internString);
			break;

		case 9:

			break;

		default:
			break;
		}
		scanner.close();
	}

}
