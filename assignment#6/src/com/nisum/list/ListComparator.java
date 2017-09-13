package com.nisum.list;

import java.util.Iterator;
import java.util.List;


/**<h1>List Comparator</h1>
 * This class used the main method to test linked list and array list
 * in terms of searching and traversing
 * @author mwasif
 *@see List
 */
public class ListComparator {
	
	/**A method to make the list form the array
	 * @param list a list of integer
	 * @param values an array of values
	 */
	public static void makeList(List<Integer> list,int[] values){
		for(int index=0;index<values.length;index++){
			list.add(values[index]);
		}
	}
	
	/**It traverse the list and returns the time of the traversal
	 * @param list a list to be traversed
	 * @return finalTime a long variable that contains the time of traversing
	 */
	public static long giveTraverseTime(List<Integer> list){
		Iterator<Integer> itr = list.iterator();
		long startTime = System.nanoTime();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		long finishTime =System.nanoTime();
		long finalTime = finishTime -startTime;
		return finalTime;
	}
	/** it searches a given element in the list and returns the time
	 * @param list a list to be traversed
	 * @param value a value to be searched
	 * @return finalTime a long variable that contains the time of traversing
	 */
	public static long giveSearchTime(List<Integer> list,int value){
		long startTime = System.nanoTime();
		list.indexOf(value);
		long finishTime =System.nanoTime();
		long finalTime = finishTime -startTime;
		return finalTime;
	}

}
