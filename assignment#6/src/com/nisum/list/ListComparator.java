package com.nisum.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
	
	
	/**A main method that is evaluates the values array and an array list and link list
	 * calls the methods of ListComparator and print it on console
	 * 
	 */
	public static void main(String[] args) {
		int[] values = {23,44,-9,14,123,56,223,445,33,45,89,1,0,21,100};
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> linklist = new LinkedList<Integer>();
		// adding values to arraylist
		ListComparator.makeList(list, values);
		// adding values to linked list
		ListComparator.makeList(linklist, values);
		System.out.println(" traversing array list :" );
		long arrayTraverseTime = ListComparator.giveTraverseTime(list);
		System.out.println(" traversing linked list :" );
		long linklistTraverseTime = ListComparator.giveTraverseTime(linklist);
		System.out.println("Searching 100 from arraylist");
		long arraySearchTime = ListComparator.giveSearchTime(list,100);
		System.out.println("Searching 100 from linkedlist");
		long listSearchTime = ListComparator.giveSearchTime(linklist,100);

		System.out.println("traversing time of array list = "+ arrayTraverseTime);
		System.out.println("traversing time of linked list = "+ linklistTraverseTime);
		System.out.println("searching time of array list = "+ arraySearchTime);
		System.out.println("Searching time of linked list = "+ listSearchTime);
		
		
		
		
	}

}
