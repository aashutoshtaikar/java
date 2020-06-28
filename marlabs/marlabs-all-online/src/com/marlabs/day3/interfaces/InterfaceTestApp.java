package com.marlabs.day3.interfaces;

public class InterfaceTestApp {

	public static void main(String[] args) {
		// normal inheritance way
		InterImplClass obj = new InterImplClass();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
		obj.f5();
		obj.f6();

		// dynamic binding way
		Inter2 obj2 = null;
		obj2 = new InterImplClass();
		obj2.f1();
		obj2.f2();
		obj2.f3();
	}

}
