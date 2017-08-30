package com.nisum.string;

/**This class is used to test the upper case method of java.lang package
 * @author mwasif
 *@see java.lang
 */
public class TestUpperCase {

	public static void main(String[] args) {
		String s = new String("Nisum teCH");
		String upper = s.toUpperCase();
		System.out.println(upper);
	}

}
