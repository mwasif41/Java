package com.nisum.filehandling;

/**The main class to test the frequencyCounter class
 * @author mwasif
 *
 */
public class Main {

	/**The main method that used word as java and search in
	 * a file and prints its count
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "java";  // word to be find
		FrequencyCounter frequencyCounter = new FrequencyCounter();
		int count = frequencyCounter.getFrequency("C:\\users\\mwasif\\Desktop\\abc.txt", word);
		System.out.println("The frequency of " + word + " word is : " + count);
		
	}
}
