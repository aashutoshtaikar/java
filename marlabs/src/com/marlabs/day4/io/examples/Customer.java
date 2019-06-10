package com.marlabs.day4.io.examples;

import java.io.Serializable;

/* The Serializable interface throws NotSerializable exception: 
 * refer source code writeObject -> writeObject0
 * if(obj instanceof Serializable){
 * 		//this doesnt throw exception
 * }
 * else{
 * 		//throws NotSerializable exception
 * }
 * 
 * The instance of keyword checks whether the object is an instance of Serializable interface
 * 
 * Marker or Tagged Interface: 
 * 1. Serializable Interface
 * 2. Cloneable Interface
 * 
 * Why Serializable is Marker Interface?
 * To instruct the JVM to perform the serializable options when that corresponding object is implementing a Serializable interface 
 * */

// to make this serializable
// to create user defined immutable object declare as final

@SuppressWarnings("serial")
public final class Customer implements Serializable {
	private String id;
	private String name;
	private transient String password;

	private long pincode;
	private String city;

	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param pincode
	 * @param city
	 */
	public Customer(String id, String name, String password, long pincode, String city) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.pincode = pincode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (password != null ? "password=" + password + ", " : "") + "pincode=" + pincode + ", "
				+ (city != null ? "city=" + city : "") + "]";
	}

}
