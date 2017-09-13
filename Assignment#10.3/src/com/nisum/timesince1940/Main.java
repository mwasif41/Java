package com.nisum.timesince1940;

import java.util.Date;

/**
 * This main class used Date util of java to get time in milliseconds
 * and seconds since 1970
 * @author mwasif
 *@see java.util.Date
 */
public class Main {
	public static void main(String args[]){
		Date date = new Date();
		long dateInSeconds = date.getTime();
		System.out.println("Date in milli second is :" + dateInSeconds);
		System.out.println("Date in seconds is :" + dateInSeconds/1000);
	}
}
