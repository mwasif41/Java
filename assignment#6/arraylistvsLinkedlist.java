import java.util.*;

public class arraylistvsLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {23,44,-9,14,123,56,223,445,33,45,89,1,0,21,100};
		ArrayList<Integer> list = new ArrayList<Integer>();
		// adding values to arraylist
		for(int index=0;index<values.length;index++){
			list.add(values[index]);
		}
		// adding values to linked list
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		for(int index=0;index<values.length;index++){
			linklist.add(values[index]);
		}
		Iterator<Integer> itr = list.iterator();
		System.out.println(" traversing array list :" );
		long start = System.nanoTime();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		long finish =System.nanoTime();
		long arrayTraverseTime = finish -start;
		System.out.println(" traversing linked list :" );
		Iterator<Integer> litr = linklist.iterator();
		start = System.nanoTime();
		while(litr.hasNext()){
			System.out.println(litr.next());	
		}
		finish = System.nanoTime();
		long linklistTraverseTime = finish - start;
		
		System.out.println("Searching 100 from arraylist");
		start = System.nanoTime();
		int index1 = list.indexOf(100);
		finish = System.nanoTime();
		long arraySearchTime = finish - start;
		
		System.out.println("Searching 100 from linkedlist");
		start = System.nanoTime();
		int index2 = linklist.indexOf(100);
		finish = System.nanoTime();
		long listSearchTime = finish - start;
		
		System.out.println("traversing time of array list = "+ arrayTraverseTime);
		System.out.println("traversing time of linked list = "+ linklistTraverseTime);
		System.out.println("searching time of array list = "+ arraySearchTime);
		System.out.println("Searching time of linked list = "+ listSearchTime);
		
		
		
		
	}

}
