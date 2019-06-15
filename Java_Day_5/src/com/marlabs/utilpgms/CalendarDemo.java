package com.marlabs.utilpgms;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(); // Calendar is abstractClass
		System.out.println(calendar);

		Calendar calendar2 = Calendar.getInstance();
		System.out.println(calendar2);

		System.out.println(calendar2.get(Calendar.YEAR));
		System.out.println(calendar2.get(Calendar.MONTH));
		System.out.println(calendar2.get(Calendar.DATE));
		System.out.println(calendar2.get(Calendar.HOUR));
		System.out.println(calendar2.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar2.get(Calendar.DAY_OF_YEAR));

		calendar2.set(Calendar.MONTH, Calendar.SEPTEMBER);
		System.out.println(calendar2.get(Calendar.MONTH));
		calendar2.set(Calendar.MONTH, 05);
		System.out.println(calendar2.get(Calendar.MONTH));

		calendar.add(Calendar.DATE, 2); // adds exact days and changes everything(Calendar.MONTH,DAY etc) accordingly
		System.out.println(calendar.get(Calendar.DATE));

		calendar.roll(Calendar.DATE, 4); // roll simply rolls this value and keeps everything unchanged
		System.out.println(calendar.get(Calendar.DATE));

	}

}
