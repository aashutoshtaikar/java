package com.marlabs.day3.typesofrelation;

import java.util.Set;

public class Employee {
	private int number;
	private String name;

	Address localAddress; // has-A
	Address permanentAddress; // Has-A

	private Set<Address> addressList; // one to many relation

	/**
	 * @param number
	 * @param name
	 */
	public Employee(int number, String name) {
		this.number(number);
		this.name(name);
	}

	public int number() {
		return number;
	}

	public void number(int number) {
		this.number = number;
	}

	public String name() {
		return name;
	}

	public void name(String name) {
		this.name = name;
	}

	public Set<Address> addressList() {
		return addressList;
	}

	public void addressList(Set<Address> addressList) {
		this.addressList = addressList;
	}

}
