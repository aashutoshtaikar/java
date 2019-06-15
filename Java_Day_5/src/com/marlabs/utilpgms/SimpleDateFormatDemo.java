package com.marlabs.utilpgms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date date = new Date();
		// "EEE MMM dd HH:mm:ss zzz yyyy"; //referred from Date::toString()
		System.out.println(date.toString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String customUKdateFormat = simpleDateFormat.format(date);
		System.out.println(customUKdateFormat);

		simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
		String customUSdateFormat = simpleDateFormat.format(date);
		System.out.println(customUSdateFormat);

		simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String customUSSlashDateFormat = simpleDateFormat.format(date);
		System.out.println(customUSSlashDateFormat);

		simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
		String customFormat = simpleDateFormat.format(date);
		System.out.println(customFormat);

		// Taking user input date from
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in format:MM-dd-yyyy");
		String userInput = scanner.next();

		simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
		try {
			Date joiningDate = simpleDateFormat.parse(userInput);
			System.out.println(simpleDateFormat.format(joiningDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
