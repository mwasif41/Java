package com.nisum.filehandling;

/**A Main class to test the FileCopier class
 * @author mwasif
 *
 */
public class Main {
	/**The main class that copy one file to another
	 * @param args
	 */
	public static void main(String args[]){
		FileCopier filecopier = new FileCopier();
		filecopier.copyFile("C:\\users\\mwasif\\Desktop\\first.txt", "C:\\users\\mwasif\\Desktop\\second.txt");	
	}
}
