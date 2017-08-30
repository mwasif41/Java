package com.nisum.filereading;
import java.io.*;
/** The format file printer is the printer in which only those file 
 * will be printed in which the format is provided
 * 
 * @author mwasif
 *
 */
public class FromatFilePrinter {
	///////////// static function to get the format//////////////
	/** Ihis method is used to get the extension of the file
	 * @param path a String that contains the path of a file
	 * @return format of the file(i.e extension)
	 */
	public static String getExtension(String path){
		
		String file =path.substring(path.lastIndexOf("\\"));
		String format = file.substring(file.indexOf('.'));
		return format;
	}
	
	/**
	 * This main method open a directory and get its path and then it will
	 * get the extension of each file using getExtension() and then only display 
	 * those files of which extension equals to the given extension 
	 */
	public static void main(String[] args) {
		File file = new File("C:\\users\\mwasif\\Downloads"); // path to check
		File[] path = file.listFiles(); // get all the files path
		String format = ".txt";  // format to be shown
		System.out.println("The list of files of format :" + format);
		for(File p:path){
			if(p.isFile()){ // if the path is of file?
				if(format.equals(FromatFilePrinter.getExtension(p.toString()))){
					System.out.println(p.getName());
				}
				// only print those files whose format is matched to given format
			}
		}
		
	}

}
