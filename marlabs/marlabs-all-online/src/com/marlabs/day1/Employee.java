package com.marlabs.day1;

public class Employee { // Business logic class
	int number;
	String name;
	String type;
	double basic;
	double commission;
	int deptNumber;
	private String password;

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", type=" + type + ", basic=" + basic + ", commission="
				+ commission + ", deptNumber=" + deptNumber + ", password=" + password + "]";
	}

	public void doInitialization() {
		this.number = 200;
		this.name = "Aashutosh";
		this.type = "trainee";
		this.basic = 9.25;
		this.commission = 5.5;
		this.deptNumber = 212;
		this.password = "ashxyz123";
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public String getPassword() {
		return password;
	}

}
