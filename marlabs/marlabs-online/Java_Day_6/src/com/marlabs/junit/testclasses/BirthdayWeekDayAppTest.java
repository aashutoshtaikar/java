package com.marlabs.junit.testclasses;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.junit.basicexamples.BirthdayWeekDayApp;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BirthdayWeekDayAppTest {
	private static BirthdayWeekDayApp birtAppTest = null;
	
	
	@BeforeClass
	public static void init() {
		System.out.println("testing constr");
		birtAppTest = new BirthdayWeekDayApp();
	}
	
	@AfterClass
	public static void destroy() {
		System.out.println("testing object destruct");
		birtAppTest = null;
	}
	
	//positive scenario
	@Test
	public void testGetWeekDay() {
		try {
			String weekdayName = birtAppTest.getWeekDay("MM-dd-yyyy","11-12-1993");
			assertEquals("Friday", weekdayName);
		} catch (ParseException e) {
			fail();
		}
	}
	
	//positive scenario
	@SuppressWarnings("unused")
	@Test
	public void testGetWeekDay1() {
		try {
			String weekdayName = birtAppTest.getWeekDay("MM-d-yyyy", "11-12-1993");
			assertEquals("Friday", weekdayName);
		} catch (ParseException e) {
			fail();
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testGetWeekDay2() {
		try {
			String weekDayName = birtAppTest.getWeekDay("MM/dd/yyyy", "11-12-1993");
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testGetWeekDay3() {
		try {
			String weekDayName = birtAppTest.getWeekDay("MM-dd-yyyy", null);
		} catch (ParseException e) {
			fail();
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
	} 
	
	@SuppressWarnings("unused")
	@Test
	public void testGetWeekDay4() {
		try {
			String weekDayName = birtAppTest.getWeekDay(null, "11-12-1993");
		} catch (ParseException e) {
			fail();
		} catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}
	

}
