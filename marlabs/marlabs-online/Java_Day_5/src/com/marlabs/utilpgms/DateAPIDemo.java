package com.marlabs.utilpgms;

import java.util.Date;

public class DateAPIDemo {

	static void printDateInfo(Date currentDate) {
		System.out.println("Year:" + (currentDate.getYear() + 1900)); // to get year using the getter methods
		System.out.println("Month:" + currentDate.getMonth());
		System.out.println("Day:" + currentDate.getDate()); // calendar day of month
		System.out.println("WeekDay:" + currentDate.getDay()); // week day
		System.out.println("Hours:" + currentDate.getHours());
		System.out.println("Minutes:" + currentDate.getMinutes());
		System.out.println("Seconds:" + currentDate.getSeconds());
		System.out.println("TimezoneOffset:" + currentDate.getTimezoneOffset());
		System.out.println("Long milliseconds:" + currentDate.getTime() + "\n");
	}

	public static void main(String[] args) {
		Date newDate = new Date(); // fraction of milliseconds

		Date currentDate = new Date(); // not deprecated
		System.out.println(currentDate);

		@SuppressWarnings("deprecation")
		Date date2 = new Date(2019, 6, 5); // deprecated
		System.out.println(date2);

		@SuppressWarnings("deprecation")
		Date date3 = new Date(2019 - 1900, 6, 5);
		System.out.println(date3);

		Date date4 = new Date(2019 - 1900, 6, 5, 24, 50); // rolls over to next day cuz of time
		System.out.println(date4);

		Date date5 = new Date(currentDate.getTime()); // long milliseconds
		System.out.println(date5);

		printDateInfo(currentDate);
		System.out.println("After changing the date values");
		currentDate.setMonth(0);
		currentDate.setYear(2017 - 1900);
		printDateInfo(currentDate);

		System.out.println(currentDate.before(date4));
		System.out.println(currentDate.after(date4));

		Date newDate1 = new Date(); // fraction of milliseconds

		boolean result = newDate.equals(newDate1); // due fraction of milliseconds it returns false
		System.out.println(result);
		System.out.println(newDate.getDate() == newDate1.getDate());
	}

}
