package com.nisum.filereading;
import java.io.File;

/** The class has the logic that it prints the path of the given using
 * ListFiles() method of the File
 * @author mwasif
 *@see File#listFiles()
 */
public class FilePrinter {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\mwasif\\Desktop\\work\\Java\\assignment#6"); // here we will pass the path of directory
		File[] path = file.listFiles(); // to get all files paths
		System.out.println("List of file is:");
		for(File p:path){
			if(p.isFile()) //if file exist
			System.out.println(p.getName()); //then prints its name
		}
	}

}
