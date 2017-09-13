package com.nisum.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The main Class is implemented to check that weather
 * a given year is a leap year or not
 * <h3>Leap Year</h3>
 * February 29 is a date that usually occurs every four years, and is called leap day. 
 * This day is added to the calendar in leap years as a corrective measure, 
 * because the Earth does not orbit the sun in precisely 365 days.
 * @author mwasif
 *@see java.util.Date
 */
public class Main {
	public static void main(String args[]){
		GregorianCalendar gregoriancalender = new GregorianCalendar(2016,1,1);
		int year = gregoriancalender.get(Calendar.YEAR);
		if(gregoriancalender.isLeapYear(year)){
			System.out.println("The year is a leap year");
		}
		else{
			System.out.println("the year is not a leap year");
		}
	}
}
