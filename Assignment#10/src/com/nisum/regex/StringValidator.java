package com.nisum.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * <h1> StringValidator </h1>
 * this class is based on regular expression that is used to check that 
 * a string only contains alphabets and no numbers, no special characters
 * and white spaces etc
 * @author wasif
 *@version 1.0.0
 */
public class StringValidator {
	/**
	 * This method is used to validate the string on the defined parameters
	 * @param givenString is the input string to validate
	 * @return a boolean, true for valid string and else for invalid string
	 */
	public boolean validateString(String givenString){
		boolean status = false;
		String regexPattern = "[A-Za-z]*";
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(givenString);
		status = matcher.matches();
		return status;
	}
}
