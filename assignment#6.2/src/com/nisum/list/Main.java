package com.nisum.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * The main program that contains the logic of searching in the ArrayList
 */
public class Main {

	/** it makes the array of list and then 
	 * searched a number by using the three differnet methods
	 * @param args
	 */
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		ListSearcher listsearcher = new ListSearcher();
		list = listsearcher.makeList(list,11,1);
		// for taking input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to be searched from the list");
		int givenNumber = scanner.nextInt();
		
		// first approach through contains
		listsearcher.searchNumber(list, givenNumber);
		
		// second approach through indexOf
		listsearcher.searcheNumberIndex(list, givenNumber);
		
		// third approach through lastIndexOf
		listsearcher.searchNumberLastIndex(list, givenNumber);
		scanner.close();
	}
}
