import java.io.*;
import java.util.Scanner;
public class filereadandSavefromConsole {

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
		
		//FileOutputStream fout = new FileOutputStream(f);
		//System.out.print(data);
	}

}
