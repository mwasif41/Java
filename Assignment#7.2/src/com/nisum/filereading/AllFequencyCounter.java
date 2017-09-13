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
	 * @param fileName in the form of string as the file path to be used
	 * @return map of keyy/pair values of occurence of words
	 */
	public Map<String,Integer> giveFrequencies(String fileName){
		Map<String, Integer> frequencies = new HashMap<String, Integer>();
		try {
			FileReader filereader = new FileReader(fileName);
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
		return frequencies;
	}
	

}
