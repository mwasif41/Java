package com.nisum.list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * <h1>ListSearch</h1>
 * it is a basic class that finds the given item in the list
 * <p>
 * it uses 3 methods
 * </li>Using contains()</li>
 *  </li>using indexOf()</li>
 * </li>using LastIndexOf()</li>
 * @author mwasif
 **/
public class ListSearch {
	/**
	 * The main program that contains the logic of searching in the ArrayList
	 */
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		// for adding number in the list
		for(int numberi=1;numberi<11;numberi++)
			list.add(numberi);
		// for taking input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to be searched from the list");
		int givenNumber = scanner.nextInt();
		
		// first approach through contains
		if(list.contains(givenNumber))
			System.out.println("From contains method the number is present in the list");
		else
			System.out.println("From contains method the number is not present in the list");
		
		// second approach through indexOf
		int index = list.indexOf(givenNumber);
		System.out.println("From indexOf method :" + index);
		
		// third approach through lastIndexOf 
		index = list.lastIndexOf(givenNumber);
		System.out.println("From lastIndexOf method :" + index);
		scanner.close();
	}
}
