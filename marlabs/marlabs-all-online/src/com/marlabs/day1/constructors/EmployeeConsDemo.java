package com.marlabs.day1.constructors;

public class EmployeeConsDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);

		Employee employee2 = new Employee(employee);
		System.out.println(employee2);

		if (employee == employee2) {
			System.out.println("same mem loc");
		} else {
			System.out.println("diff mem loc");
		}
	}

}
