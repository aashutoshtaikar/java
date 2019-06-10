package com.marlabs.day4.io.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainApp {
	public static void serializeTheObject(final Customer customer) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("src/data.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(customer);
			System.out.println("Object serialized successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		// Java 1.7 allows exceptions to added in existing catch using
		// catch(FileNotFoundException | IOException)
		// but IOException is a super class for FileNotFoundException thus cannot be
		// combined

		// data.txt is in byte oriented stream format and thus is not readable
	}

	public static Customer deSerializeTheObject(String filePath) {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Customer customer = null;
		try {
			fileInputStream = new FileInputStream(filePath);
			objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			customer = (Customer) object; // down casting the from Object class to Customer class
			System.out.println("Object De-serialized successfully");
			System.out.println(customer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (objectInputStream != null) {
					objectInputStream.close();
				}
			} catch (IOException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
		return customer;
	}

	public static void main(String[] args) {
		System.out.println("1.Serialize the object");
		System.out.println("2.De-serialize the object");
		System.out.println("3.Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = scanner.nextInt();
		Customer customer = new Customer("123", "asd", "asd123", 8854l, "piscataway");

		switch (choice) {
		case 1:
			serializeTheObject(customer);
			break;

		case 2:
			Customer customer2 = deSerializeTheObject("src/data.txt");
			if (customer == customer2) {
				System.out.println("same memory location -- this wont happen in case of de-serialization");
			} else {
				System.out.println("Deserialization will make an object in a different mememory location");
			}
			break;

		default:
			System.exit(0);
			break;
		}
		scanner.close();
	}

}
