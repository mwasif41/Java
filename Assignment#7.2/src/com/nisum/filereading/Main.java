package com.nisum.filereading;

import java.util.Map;
	
/**The main class to test AllfrequencyCounter
 * @author mwasif
 *
 */
public class Main {
	/**
	 * the main method creates a map of string and integer and then open s file and
	 * read it using a loop and increment the keys of the all words and 
	 * finally displays the content on console
	 */
	public static void main(String[] args) {
		AllFequencyCounter frequencyCounter = new AllFequencyCounter();
		Map<String, Integer> frequencies  = frequencyCounter.giveFrequencies("C:\\users\\mwasif\\Desktop\\abc.txt");
		System.out.println(" The values of each word in a file ");
		for (Map.Entry<String, Integer> f : frequencies.entrySet()) {
			System.out.println(f.getKey() + " is " + f.getValue());
		}
	}
}
