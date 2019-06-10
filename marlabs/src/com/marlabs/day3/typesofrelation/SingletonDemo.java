package com.marlabs.day3.typesofrelation;

import java.util.HashMap;
import java.util.Map;

public class SingletonDemo {

//	private static SingletonDemo mySingleton = new SingletonDemo(); //eager instantiation
	private static SingletonDemo mySingleton = null;
	private Map<String, String> loginDetailsMap = null;

	private SingletonDemo() {
		System.out.println("from constr");
		loginDetailsMap = new HashMap<String, String>();
	}

	// synchronized => threadsafe
	public synchronized static SingletonDemo getInstance() {
		if (mySingleton == null) {
			mySingleton = new SingletonDemo(); // lazy instantiation
		}
		return mySingleton;
	}

	public void loadUserDetails() {
		loginDetailsMap.put("abc", "asdads");
		loginDetailsMap.put("xcv", "asdads");
		loginDetailsMap.put("erw", "asdads");
		loginDetailsMap.put("ty", "asdads");
		loginDetailsMap.put("tygh", "asdads");
		loginDetailsMap.put("sdfg", "asdads");
	}

	public boolean validateUserDetails(String userName, String userPassword) {
		boolean validationFlag = false;
		if (loginDetailsMap.containsKey(userName)) {
			if (loginDetailsMap.get(userName).equals(userPassword)) {
				validationFlag = true;
			}
		}
		return validationFlag;
	}

}
