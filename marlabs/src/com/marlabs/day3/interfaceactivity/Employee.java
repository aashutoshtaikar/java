/**
 * 
 */
package com.marlabs.day3.interfaceactivity;

public abstract class Employee implements IEmployee {
	int number;
	String name;
	String job;

	private String empPassword;
	int deptNumber;

	@Override
	public void setEmpPassword(final String password) {
		this.empPassword = password;
	}

	@Override
	public String getEmpPassword() {
		return empPassword;
	}

	/**
	 * @param number
	 * @param name
	 * @param job
	 * @param empPassword
	 * @param deptNumber
	 */
	public Employee(int number, String name, String job, String empPassword, int deptNumber) {
		this.number = number;
		this.name = name;
		this.job = job;
		this.empPassword = empPassword;
		this.deptNumber = deptNumber;
	}

	@Override
	public void displaySalaryStatement() {
		System.out.println("Employee [number=" + number + ", " + (name != null ? "name=" + name + ", " : "")
				+ (job != null ? "job=" + job + ", " : "") + "deptNumber=" + deptNumber + "]");
	}

}
