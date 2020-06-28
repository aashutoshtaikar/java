package com.marlabs.junit.basicexamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayWeekDayApp {

	// return the weekday from birth day date
	public String getWeekDay(String dateFormat, String birthDate) throws ParseException, NullPointerException {
		if(dateFormat==null || birthDate==null) {
			throw new NullPointerException("date format or date cannot be null");
		}
		SimpleDateFormat dateFormatter = null;
		dateFormatter = new SimpleDateFormat(dateFormat); // set format
		Date birthdayDate = dateFormatter.parse(birthDate); // parse date to Date class

		dateFormatter = new SimpleDateFormat("EEEE"); // set format
		String weekdayName = dateFormatter.format(birthdayDate); // format date
		return weekdayName;
	}

}
