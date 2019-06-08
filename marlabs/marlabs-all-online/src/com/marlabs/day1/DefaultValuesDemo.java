package com.marlabs.day1;

//import java.lang.*; //by default imported for every project 

public class DefaultValuesDemo {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean b1;
	String str;
	Object obj;

	public void knowDefaultValues() {
		System.out.println("default value for int family:" + i);
		System.out.println("default value for float family:" + f);
		System.out.println("default value for char:" + c);
		System.out.println("default value for boolean:" + b1);
		System.out.println("default value for String:" + str);
		System.out.println("default value for Object:" + obj);
	}

	public static void main(String[] args) {
		DefaultValuesDemo demo = new DefaultValuesDemo();
		System.out.println(demo);
		demo.knowDefaultValues();

	}

}
