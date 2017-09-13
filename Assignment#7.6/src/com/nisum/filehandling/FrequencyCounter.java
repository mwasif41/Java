package com.nisum.filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

/**The FrequencyCounter class is the implementation of the program in which a  
 * a file is being read and then using a Map it would make a collection of key value pair
 * <p>s
 * The file is being read using BufferedReader 
 * @author mwasif
 *@see FileReader
 *@see BufferedReader
 *@see Map

 *  */
public class FrequencyCounter {
	
	/**The method to get number of occurence of words in the file
	 * @param filePath path of file
	 * @param word word to be searched
	 * @return count of word
	 */
	public int getFrequency(String filePath,String word){
		int count = 0; // a global counter to count
		try{FileReader fr=new FileReader(filePath); // a file that is readed
			BufferedReader br =new BufferedReader(fr); // a buffer to read line by line
			String line = null; // temp storage of a line 
			while((line = br.readLine())!= null){ // retrieving line by line of file
				for(String temp:line.split(" ")){ // converting line to array of string
					if(temp.equalsIgnoreCase(word)) // if word equals to a word
						count++; // then increase count
				}
			}
			fr.close();
			br.close();
		}catch(Exception e){e.printStackTrace();} 
		return count;
	}
	
	
}
