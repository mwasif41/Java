package com.nisum.consolefilereading;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/**	ConsoleReader is the class in which an input is given to the 
 * console and the output is saved in a file
 * @author mwasif
 *
 */
public class ConsoleReader {
	
	/** a method to create a file and also prompt weather the 
	 * file is craeted or not
	 * @param filePath Absolute path of file
	 * @return A file that is being created or fetched
	 */
	public File createFile(String filePath){
		File file = new File(filePath); // in order to make a file in the daesktop
		// below module is for filee creation 
		try{  if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
		 }catch(Exception e){e.printStackTrace();}
		return file;
	}
	
	/**A method to store data inn the file from the console
	 * @param file a file in which date to be stored
	 */
	public void storeDateFromConsole(File file){
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
