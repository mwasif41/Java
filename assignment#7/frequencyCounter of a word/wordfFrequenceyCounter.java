import java.io.*;
public class wordfFrequenceyCounter {

	public static void main(String[] args) {
		String word = "java";  // word to be find
		int count = 0; // a global counter to count
		try{FileReader fr=new FileReader("C:\\users\\mwasif\\Desktop\\abc.txt"); // a file that is readed
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
		System.out.println("The frequency of " + word + " word is : " + count);
		
	}
	
}
