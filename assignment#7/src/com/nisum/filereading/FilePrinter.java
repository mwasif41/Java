package com.nisum.filereading;
import java.io.File;

/** The class has the logic that it prints the path of the given using
 * ListFiles() method of the File
 * @author mwasif
 *@see File#listFiles()
 */
public class FilePrinter {

	/**The method to print the path of all the files on the console
	 * @param folderPath path of the folder
	 */
	public void printFilePath(String folderPath){
		File file = new File(folderPath); // here we will pass the path of directory
		File[] path = file.listFiles(); // to get all files paths
		System.out.println("List of file is:");
		for(File p:path){
			if(p.isFile()) //if file exist
			System.out.println(p.getName()); //then prints its name
		}
	}
	

}
