package com.marlabs.day3.typesofrelation;

import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		// uses-A relation
		Address localAddr = new Address(183, "Rutgers", 183, 8854, "Piscataway");
		System.out.println(localAddr);
		Address permAddr = new Address(18, "Rut", 18, 884, "Pisca");
		System.out.println(permAddr);

		Set<Address> addressList = new HashSet<Address>();
		addressList.add(localAddr);
		addressList.add(permAddr);

		Employee emp1 = new Employee(345, "Aashutosh");
		emp1.addressList(addressList);

	}

}
