package com.nisum.filereading;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/**	ConsoleReader is the class in which an niput is given to the console and the output is saved in a file
 * @author mwasif
 *
 */
public class ConsoleReader {

	/**
	 * In this main method the logic of this has been implemented
	 * a File is being created and after creation
	 * a FileWriter is used to write in a file 
	 * @see File
	 * @see FileWriter
	 */
	public static void main(String[] args) {
		File file = new File("C:\\users\\mwasif\\Desktop\\abc.txt"); // in order to make a file in the daesktop
		// below module is for filee creation 
		try{  if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
		 }catch(Exception e){e.printStackTrace();}
		
		Scanner s = new Scanner(System.in);
		try{
			FileWriter fw = new FileWriter(file);
		    System.out.println("PLease Enter data to be written in the file" + file);
			String data = s.nextLine();
			fw.write(data);
			fw.close();
			System.out.println("entered data is successfully stored");
		}
		catch(Exception e){e.printStackTrace();}
		finally {
			s.close();	
		}
		
	}

}
