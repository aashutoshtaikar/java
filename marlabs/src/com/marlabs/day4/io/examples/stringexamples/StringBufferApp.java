package com.marlabs.day4.io.examples.stringexamples;

public class StringBufferApp {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer(" is ");
		stringBuffer.append("Hot");
		stringBuffer.insert(0, "Java");
		stringBuffer.append('\n');
		stringBuffer.append("This is ");
		stringBuffer.append(true);
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.charAt(0));

		stringBuffer.setCharAt(21, 'T');
		stringBuffer.append('\n');
		stringBuffer.append("Java is #");
		stringBuffer.append(1);
		System.out.println(stringBuffer);
		System.out.println("Converting stringbuffer object to string");
		String s = stringBuffer.toString();
		System.out.println(s);

		stringBuffer.reverse();
		System.out.println(stringBuffer);

		System.out.println(stringBuffer.length());
		System.out.println(stringBuffer.capacity());
	}

}
