package com.nisum.filereading;
import java.io.FileReader;
import java.io.FileWriter;

/**The fileCopier class is used to copy a file to another
 * file using FileReader and FileWriter
 * @author mwasif
 *@see FileWriter
 *@see FileReader
 */
public class FileCopier {
	public static void main(String args[]){
	try{
		FileReader fr = new FileReader("C:\\users\\mwasif\\Desktop\\first.txt");
		FileWriter fw = new FileWriter("C:\\users\\mwasif\\Desktop\\second.txt");
		int i=0;
		while((i=fr.read()) != -1){
			fw.write((char)i);
			}
		fr.close();
		fw.close();
		}catch(Exception e){e.printStackTrace();}	
		
	}	
}
