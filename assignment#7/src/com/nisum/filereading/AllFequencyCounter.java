package com.nisum.filereading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**<h2>AllFrequencyCounter</h2>
 * it would make a map of the occurence of all the words in a file
 * and then display it
 * @author mwasif
 *
 */

public class AllFequencyCounter {

	/**
	 * the main method creates a map of string and integer and then open s file and
	 * read it using a loop and increment the keys of the all words and 
	 * finally displays the content on console
	 */
	public static void main(String[] args) {
		Map<String, Integer> frequencies = new HashMap<String, Integer>();
		try {
			FileReader filereader = new FileReader("C:\\users\\mwasif\\Desktop\\abc.txt");
			BufferedReader bufferreader = new BufferedReader(filereader);
			String line = null;
			while ((line = bufferreader.readLine()) != null) {
				for (String temp : line.split(" ")) {
					Integer frequency = frequencies.get(temp.toLowerCase());
					if (frequency == null)
						frequency = 0;
					frequency++;
					frequencies.put(temp.toLowerCase(), frequency);
				}
			}
			filereader.close();
			bufferreader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" The values of each word in a file ");
		for (Map.Entry<String, Integer> f : frequencies.entrySet()) {
			System.out.println(f.getKey() + " is " + f.getValue());
		}
	}

}
