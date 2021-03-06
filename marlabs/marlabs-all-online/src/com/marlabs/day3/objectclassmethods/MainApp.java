package com.marlabs.day3.objectclassmethods;

import java.util.HashSet;
import java.util.Set;

public class MainApp {
	public static void main(String[] args) {

		Customer customer = new Customer(8, "Aashutosh", "asd1234", "Piscataway");
		Class<? extends Customer> className = customer.getClass(); // class instance

		String classNameValue = className.getName(); //
		System.out.println("class instance: " + className);
		System.out.println("class name: " + classNameValue);

		int customerHashcode = customer.hashCode();
		System.out.println("customer hashCode: " + customerHashcode);

		Customer customer1 = new Customer(8, "Aashutosh", "asd1234", "Piscataway");
		System.out.println("customer1 hashCode: " + customer1.hashCode());

		boolean objEqualsFlag = customer.equals(customer1);
		if (objEqualsFlag) {
			System.out.println("objects are equal");
		} else {
			System.out.println("objects are unequal");
		}

		Set<Customer> setOfCustomers = new HashSet<Customer>();
		setOfCustomers.add(customer);
		setOfCustomers.add(customer1);

//		for (Iterator iterator = setOfCustomers.iterator(); iterator.hasNext();) {
//			Customer customer2 = (Customer) iterator.next();
//			System.out.println(customer2);
//		}

		for (Customer x : setOfCustomers) {
			System.out.println(x);
		}

		System.out.println("===clone()===");
		try {
			Object object = customer.clone();
			Customer customer2 = (Customer) object; // explicit object casting
			System.out.println("original object data: " + customer);
			System.out.println("Cloned object data: " + customer2);

			if (customer == customer2) {
				System.out.println("cloned object refernce is same");
			} else {
				System.out.println("cloned object has a different memory");
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Making objects eligible for garbage collector
		customer = null;
		customer1 = null;

		System.gc();
	}
}
