package com.marlabs.day1.constructors;

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

	public Employee() {
		System.out.println("from default constructor");
		this.number = 200;
		this.name = "Aashutosh";
		this.type = "trainee";
		this.basic = 9.25;
		this.commission = 5.5;
		this.deptNumber = 212;
		this.password = "ashxyz123";
	}

	/**
	 * @param number
	 * @param name
	 * @param type
	 * @param basic
	 * @param commission
	 * @param deptNumber
	 * @param password
	 */
	public Employee(int number, String name, String type, double basic, double commission, int deptNumber,
			String password) {
		System.out.println("im from parrameterized constructor");
		this.number = number;
		this.name = name;
		this.type = type;
		this.basic = basic;
		this.commission = commission;
		this.deptNumber = deptNumber;
		this.password = password;
	}

	public Employee(Employee other) {
		if (this != other) {
			System.out.println("from copy constr");
			this.number = other.number;
			this.name = other.name;

			if (other.type.equals("temporary")) {
				this.type = "Permanent";
				this.basic = other.basic + 1500;
				this.commission = other.commission + 3;
			}

			this.deptNumber = other.deptNumber;
			this.password = other.password;
		}
	}

	public void setPassword(String pass) {
		password = pass;
	}

	public String getPassword() {
		return password;
	}

}
