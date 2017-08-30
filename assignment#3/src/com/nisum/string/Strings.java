package com.nisum.string;

/**
 * this class is to show the difference in the literal String and object String
 * 
 * @author mwasif
 *
 */
public class Strings {

	/**
	 * This main method makes a literal string and an object String
	 *  if compare it using == and also with equals method
	 *  the result was the both strings were not equal when == is used
	 *  while the both strings were matched when equals is used 
	 */
	public static void main(String[] args) {
		String name = "wasif"; // literal
		String anotherName = new String("wasif"); // object
		if(name == anotherName){
			System.out.println("The string are matched");
		}
		else
			System.out.println("==  unmatched");
		boolean value = name.equals(anotherName);
		System.out.println("equals() comarision is = " + value);
		
	}

}
