/*singleton serialization
 * */
package com.marlabs.day4.io.examples.singletonbreaking;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class SingletonDemo implements Serializable {

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
		loginDetailsMap.put("john", "john123");
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
