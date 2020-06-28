package com.marlabs.day2;

import java.util.HashMap;
import java.util.Map;

public class SingletonDemo {

//	private static SingletonDemo mySingleton = new SingletonDemo(); //eager instantiation
	private static SingletonDemo mySingleton = null;

	private SingletonDemo() {
		System.out.println("from constr");
	}

	// synchronized => threadsafe
	public synchronized static SingletonDemo getInstance() {
		if (mySingleton == null) {
			mySingleton = new SingletonDemo(); // lazy instantiation
		}
		return mySingleton;
	}

	public void loadUserDetails() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc", "asdads");
		map.put("xcv", "asdads");
		map.put("erw", "asdads");
		map.put("ty", "asdads");
		map.put("tygh", "asdads");
		map.put("sdfg", "asdads");
	}

}
