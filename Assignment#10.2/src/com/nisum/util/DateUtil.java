
package com.nisum.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * the DateUtil class is used to provide the functions 
 * that are used to convert a date into a predefined format
 * 
 * @author mwasif
 *
 */
public class DateUtil {

	/**This util function is used to format a date in a defined format
	 * @param gregoriancalendar a gregorian calendar of which the date is to be formated
	 * @param format a format to be used it should be 1 for <b>E M dd HH:mm:ss yyyy</b>
	 * and any number for <b>yyyy M dd HH:mm:ss</b>
	 * @return a string od formated date
	 */
	public static String convertDateFormat(Calendar gregoriancalendar,int format){
		SimpleDateFormat dateFormat;
		if(format == 1)
			dateFormat = new SimpleDateFormat("E M dd HH:mm:ss yyyy");
		else
			dateFormat = new SimpleDateFormat("yyyy M dd HH:mm:ss");
		return dateFormat.format(gregoriancalendar.getTime());
	}
	
}
