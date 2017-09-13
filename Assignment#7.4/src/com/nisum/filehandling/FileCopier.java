package com.nisum.filehandling;
import java.io.FileReader;
import java.io.FileWriter;

/**The fileCopier class is used to copy a file to another
 * file using FileReader and FileWriter
 * @author mwasif
 *@see FileWriter
 *@see FileReader
 */
public class FileCopier {
	
	/**A method to copy one file to another
	 * @param sourcePath path of source file
	 * @param destinationPath path of destination file
	 */
	public void copyFile(String sourcePath,String destinationPath){
		try{
			FileReader fr = new FileReader(sourcePath);
			FileWriter fw = new FileWriter(destinationPath);
			int index=0;
			while((index=fr.read()) != -1){
				fw.write((char)index);
				}
			fr.close();
			fw.close();
			}catch(Exception e){e.printStackTrace();}		
	}
	
	
	
}
