/*singleton serialization
 * */
package com.marlabs.day4.io.examples.perfectSingleton;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.management.InstanceAlreadyExistsException;

@SuppressWarnings("serial")
public class SingletonDemo implements Serializable, Cloneable {

	// private static SingletonDemo mySingleton = new SingletonDemo(); //eager
	// instantiation
	private static SingletonDemo mySingleton = null;
	private Map<String, String> loginDetailsMap = null;
	private static boolean instanceFlag = false;

	// 4. Preventing reflexion API from getting/ creating a new object of
	// mySingleton
	private SingletonDemo() throws InstanceAlreadyExistsException {
		if (instanceFlag) {
			// throw new InstantiationException("instance already exists"); // can throw
			// this also instead of
			throw new InstanceAlreadyExistsException("preventing reflection API to create new instance");
		} else {
			System.out.println("from singleton constr");
			loginDetailsMap = new HashMap<String, String>();
		}
	}

	// 1. synchronized keyowrd => to make method threadsafe, this is a factory
	// method
	public synchronized static SingletonDemo getInstance() throws InstanceAlreadyExistsException {
		if (mySingleton == null) {
			mySingleton = new SingletonDemo();
		}
		return mySingleton;
	}

	// 2. De-serialization safe
	// to abide the singleton principle while de-serialization
	// to get the same memory location for the singleton, have to serialize again,
	// deserializing the previously serialized object will throw a
	// ClassNotFoundException
	protected Object readResolve() {
		return mySingleton;
	}

	// 3. singleton should not be clonable -> point cursor at Clonable -> source ->
	// Override/Implement methods
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("cloning not allowed for singleton object");
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
