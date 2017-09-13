package com.nisum.consolefilereading;

import java.io.File;
import java.io.FileWriter;

/**The Main class is to test the ConsoleReader CLass
 * @author mwasif
 *
 */
public class Main {
	/**
	 * In this main method the logic of this has been implemented
	 * a File is being created and after creation
	 * a FileWriter is used to write in a file 
	 * @see File
	 * @see FileWriter
	 */
	public static void main(String[] args) {
		ConsoleReader consoleReader = new ConsoleReader();
		File file = consoleReader.createFile("C:\\users\\mwasif\\Desktop\\abc.txt");
		consoleReader.storeDateFromConsole(file);
	}

}
