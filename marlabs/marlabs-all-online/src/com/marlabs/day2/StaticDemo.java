package com.marlabs.day2;

class Demo {
	int a;
	static int b;

	// executes before main
	// can access only static vars
	static {
		System.out.println("from static block");
	}

	// instance block
	// can access both static and instance vars
	{
		System.out.println("from instance block");
	}

	void a(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + "]";
	}

}

public class StaticDemo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.a = 10;
		Demo.b = 20;
		System.out.println(demo);
		System.out.println(Demo.b);

		Demo demo2 = new Demo();
		demo2.a = 30;
		System.out.println(demo2);
		System.out.println(Demo.b);
	}

}
