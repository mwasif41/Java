package com.nisum.regex;

import java.util.Scanner;

/**
 * this is the main class to test the StringValidator Class
 * @see StringValidator
 * @author wasif
 *
 */
public class Main {

	/**
	 * This main method first take input from user and then
	 * call the validateString(args) method of StringValidator
	 * and print on console 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to validate");
		String inputString = scanner.nextLine();
		StringValidator validator = new StringValidator();
		if(validator.validateString(inputString)){
			System.out.println("The given string is in correct syntax");
		}
		else{
			System.out.println("invalid string");
		}
		scanner.close();

	}

}
