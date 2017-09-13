package com.nisum.gregoriancalendar;
import com.nisum.util.DateUtil;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This main class is used to add 1 month in the time and subtract 15 days
 * from the current date and also print it in the formated way
 * @author mwasif
 *@see java.util.GregorianCalendar
 */
public class Main {
	public static void main(String args[]){
		Calendar gregoriancalendar = GregorianCalendar.getInstance();
		gregoriancalendar.add(Calendar.MONTH, 1);
		gregoriancalendar.add(Calendar.DATE, -15);
		System.out.println(DateUtil.convertDateFormat(gregoriancalendar, 1));
		System.out.println(DateUtil.convertDateFormat(gregoriancalendar, 2));
		
	}
}
