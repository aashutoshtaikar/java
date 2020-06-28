package com.marlabs.day3.interfaceactivity;

import java.util.Scanner;

public class DynamicBindingExample {

	public static void main(String[] args) {
		IEmployee employee = null; // Base Class reference
		System.out.println("Enter the type of Employee");
		Scanner input = new Scanner(System.in);

		String empType = input.next();
		if (empType.equals("PEmployee")) {
			employee = new PermanentEmployee(1, "Aashuosh", "dev", "asd1234", 123, 5000, 200, 222.2d);
		} else if (empType.equals("CEmployee")) {
			employee = new ContractEmployee(2, "Aashutosh", "jdev", "asg1234", 234, 3000, 30, 1.2f);
		} else {
			System.err.println("Enter correct employee type");
			System.exit(0); // Successful termination of JVM
		}

		employee.doSalaryCalculation(); // runtime polymorphic method call(dynamic binding)
		employee.displaySalaryStatement();
		employee.setEmpPassword("admin123");
		input.close();

	}

}
