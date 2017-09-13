package com.nisum.filehandling;

import java.io.File;

/**The main class to test the FormatFilePrinter
 * @author mwasif
 *
 */
public class Main {
	/**
	 * This main method open a directory and get its path and then it will
	 * get the extension of each file using getExtension() and then only display 
	 * those files of which extension equals to the given extension 
	 */
	public static void main(String[] args) {
		FormatFilePrinter filePrinter = new FormatFilePrinter();
		File file = new File("C:\\users\\mwasif\\Downloads"); // path to check
		String format = ".txt";  // format to be shown
		filePrinter.printFileNameWithExtension(file, format);
	
	}

}
