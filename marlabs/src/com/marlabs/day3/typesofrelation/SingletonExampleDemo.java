package com.marlabs.day3.typesofrelation;

public class SingletonExampleDemo {

	public static void main(String[] args) {
		SingletonDemo singleobj = SingletonDemo.getInstance();
		System.out.println(singleobj);

		SingletonDemo singleObj2 = SingletonDemo.getInstance();
		System.out.println(singleObj2); // both references point to the same location

		singleObj2.loadUserDetails();
		System.out.println(singleobj.validateUserDetails("abc", "asdads") ? "login success"
				: "username or password does not match");

//		SingletonDemo singleObj3 = new SingletonDemo(); //this should be restricted by making the default constr private
//		System.out.println(singleObj3);

	}

}
