package com.marlabs.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthdayWeekDayApp {

	// return the weekday from birth day date
	static String getWeekDay(String dateFormat, String birthDate) throws ParseException {
		SimpleDateFormat dateFormatter = null;
		dateFormatter = new SimpleDateFormat(dateFormat); // set format
		Date birthdayDate = dateFormatter.parse(birthDate); // parse date to Date class

		dateFormatter = new SimpleDateFormat("EEEE"); // set format
		String weekdayName = dateFormatter.format(birthdayDate); // format date
		return weekdayName;
	}

	static String getMonthName(String dateFormat, String birthDate) throws ParseException {
		SimpleDateFormat dateFormatter = null;
		dateFormatter = new SimpleDateFormat(dateFormat); // set format
		Date birthdayDate = dateFormatter.parse(birthDate); // parse date to Date class

		dateFormatter = new SimpleDateFormat("MMMM"); // set format
		String monthName = dateFormatter.format(birthdayDate); // format date
		return monthName;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date format:");
		String dateFormat = scanner.next();
		System.out.println("Enter birthday:");
		String birthDate = scanner.next();

		String birthday;
		try {
			birthday = getWeekDay(dateFormat, birthDate);
			System.out.println(birthday);
			System.out.println(getMonthName(dateFormat, birthDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
