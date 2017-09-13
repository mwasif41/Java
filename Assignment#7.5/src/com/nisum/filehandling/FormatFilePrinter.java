package com.nisum.filehandling;

import java.io.File;

/** The format file printer is the printer in which only those file 
 * will be printed in which the format is provided
 * 
 * @author mwasif
 *
 */
public class FormatFilePrinter {
	///////////// static function to get the format//////////////
	/** This method is used to get the extension of the file
	 * @param path a String that contains the path of a file
	 * @return format of the file(i.e extension)
	 */
	public String getExtension(String path){
		
		String file =path.substring(path.lastIndexOf("\\"));
		String format = file.substring(file.indexOf('.'));
		return format;
	}
	
	/**A method to print all the file with a specific extension
	 * @param file folder path
	 * @param format format of file to be searched
	 */
	public void printFileNameWithExtension(File file,String format){
		File[] path = file.listFiles(); // get all the files path
		System.out.println("The list of files of format :" + format);
		for(File p:path){
			if(p.isFile()){ // if the path is of file?
				if(format.equals(getExtension(p.toString()))){
					System.out.println(p.getName());
				}
				// only print those files whose format is matched to given format
			}
		}
	}
	

}
