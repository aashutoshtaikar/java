package com.marlabs.day4.io.examples.perfectSingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.management.InstanceAlreadyExistsException;

public class SingletonExampleDemo {

	public static void serializeTheObject(final SingletonDemo singletonDemo) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream("src/dataSingleton.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(singletonDemo);
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
	}

	public static SingletonDemo deSerializeTheObject(String filePath) {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		SingletonDemo singletonDemo = null;
		try {
			fileInputStream = new FileInputStream(filePath);
			objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			singletonDemo = (SingletonDemo) object;
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
				e.printStackTrace();
			}
		}

		return singletonDemo;
	}

	public static void main(String[] args) throws InstanceAlreadyExistsException {
		System.out.println("1.Serialize the object");
		System.out.println("2.De-serialize the object");
		System.out.println("3.Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();

		SingletonDemo singletonDemo = SingletonDemo.getInstance();
		singletonDemo.loadUserDetails();
		SingletonDemo singletonDemo2 = null;

		switch (choice) {
		case 1:
			serializeTheObject(singletonDemo);
			System.out
					.println(singletonDemo.validateUserDetails("john", "john123") ? "login success" : "login failure");
			System.out.println("Object serialized successfully");
			break;

		case 2:
			singletonDemo2 = deSerializeTheObject("src/dataSingleton.txt");
			System.out
					.println(singletonDemo2.validateUserDetails("john", "john123") ? "login success" : "login failure");

			if (singletonDemo == singletonDemo2) {
				System.out.println("same mem loc");
			} else {
				System.out.println("different mem loc");
			}
			break;

		case 3:
			System.exit(0);
			System.out.println("Exited");
			break;

		default:
			System.out.println("Wrong value entered");
			break;
		}

		scanner.close();
	}

}
