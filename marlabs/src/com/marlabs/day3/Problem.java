package com.marlabs.day3;

class Demo {
	protected int i;
}

class Demo1 extends Demo {

}

//multi-level inheritance
class Demo2 extends Demo1 {
//	i = 10; // compile time error, this place is for new variable declaration, operations cannot be done here
	{
		i = 10;
	}

	void display() {
		System.out.println("displaying..");
	}
}

public class Problem {

	public static void main(String[] args) {

	}

}
