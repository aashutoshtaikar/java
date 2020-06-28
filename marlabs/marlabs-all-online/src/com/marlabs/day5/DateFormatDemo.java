package com.marlabs.day5;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
		String formattedDate = dateFormat.format(date);
		System.out.println(formattedDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
		String formattedDate1 = dateFormat.format(date);
		System.out.println(formattedDate);

		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
		String formattedDate2 = dateFormat.format(date);
		System.out.println(formattedDate2);

		dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH);
		String formattedDate3 = dateFormat.format(date);
		System.out.println(formattedDate3);

		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINESE);
		formattedDate3 = dateFormat.format(date);
		System.out.println(formattedDate3);

		DateFormat french = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRENCH);
		String frenchformatted = french.format(date);
		System.out.println(frenchformatted);
	}

}
