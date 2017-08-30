package com.nisum.string;

/**
 * StringBuilderAndBuffer is the class to check the performance of the two string
 * <li>String builder</li>
 * <li>String Buffer</li>
 * <p>
 * it displays the result on the screen
 * @author mwasif
 *
 */
public class StringBuilderAndBuffer {

	/**this is the main class that compares the two strings
	 * by using <b>nanoTime()</b> method of System class
	 * and then take difference of starting and finish time of a task
	 * the string which would accomplish its task in lesser time is faster
	 */
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Nisum technologies");
		StringBuilder builder = new StringBuilder("Nisum technologies");
		long startTime = System.nanoTime();
		for (int i = 0; i < buffer.length(); i++)
			System.out.print(buffer.charAt(i));

		long finishTime = System.nanoTime();

		long bufferTime = finishTime - startTime;

		startTime = System.nanoTime();
		for (int i = 0; i < builder.length(); i++)
			System.out.print(builder.charAt(i));

		finishTime = System.nanoTime();
		long builderTime = finishTime - startTime;
		System.out.println("String builder time is: " + builderTime + " ns");
		System.out.println("String buffer time is: " + bufferTime + " ns");

		if (builderTime > bufferTime) {
			System.out.println("Buffer is faster");
		} else {
			System.out.println("Builder is faster");

		}
	}
}
