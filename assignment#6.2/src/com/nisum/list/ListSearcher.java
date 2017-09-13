package com.nisum.list;
import java.util.List;
 /** <h1>ListSearch</h1>
 * it is a basic class that finds the given item in the list
 * <p>
 * it uses 3 methods
 * </li>Using contains()</li>
 *  </li>using indexOf()</li>
 * </li>using LastIndexOf()</li>
 * @author mwasif
 **/
public class ListSearcher {
	/**A method to add a sequence of numbers ina string
	 * @param list a list to be changed
	 * @param upperRange the ending number of list
	 * @param lowerRange the starting number of the lsit
	 * @return updated list
	 */
	public List<Integer> makeList(List<Integer> list,int upperRange,int lowerRange){
		// for adding number in the list
		for(int number=lowerRange;number<upperRange;number++)
			list.add(number);
		return list;
	}
	
	/** it used contains method to search a number in the list
	 * @param list list to be used
	 * @param number number to be searched
	 * @see java.util.List#contains(Object)
	 */
	public void searchNumber(List<Integer> list,int number){
		if(list.contains(number))
			System.out.println("From contains method the number is present in the list");
		else
			System.out.println("From contains method the number is not present in the list");
		
	} 
	/** it used indexOf() method to search a number in the list
	 * @param list list to be used
	 * @param number number to be searched
	 * @see java.util.List#indexOf(Object)
	 */
	public void searcheNumberIndex(List<Integer> list,int number){
		int index = list.indexOf(number);
		System.out.println("From indexOf method :" + index);
	}
	/** it used lastIndexOf() method to search a number in the list
	 * @param list list to be used
	 * @param number number to be searched
	 * @see java.util.List#lastIndexOf(Object)
	 */
	public void searchNumberLastIndex(List<Integer> list,int number){
		int index = list.lastIndexOf(number);
		System.out.println("From lastIndexOf method :" + index);
	}
	
	
}
