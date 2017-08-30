package com.nisum.exception;

/**This class is the custom null string exception that extends Exception class
 * @author mwasif
 *
 */
public class NullStringException extends Exception {
	/**This is the constructor that class the constructor of Exception class
	 * @param string a String that would be checked
	 */
	public NullStringException(String string){
		super(string); // to call parent constructor
	}
}
