package com.marlabs.day3.interfaces;

public class InterImplClass extends C1 implements Inter2, Inter3 {

	@Override
	public void f1() {
		System.out.println("from f1");
	}

	@Override
	public void f2() {
		System.out.println("from f2");
	}

	@Override
	public void f4() {
		System.out.println("from f4");
	}

	@Override
	public void f3() {
		System.out.println("from f3");
	}

	public void f6() {
		System.out.println("from f5");
	}

}
