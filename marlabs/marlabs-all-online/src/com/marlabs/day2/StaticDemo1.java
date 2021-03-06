package com.marlabs.day2;

public class StaticDemo1 {
	int a;
	static int b;

	// executes before main
	static {
		System.out.println("from static block");
	}

	// instance block
	// executed whenever an object is created
	{
		System.out.println("from instance block");
	}

	public StaticDemo1() {
		System.out.println("from construc");
	}

	void a(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + "]";
	}

	public static void main(String[] args) {
		System.out.println("from main method");
		StaticDemo1 staticDemo = new StaticDemo1();
		StaticDemo1 staticDemo1 = new StaticDemo1();

	}

}
