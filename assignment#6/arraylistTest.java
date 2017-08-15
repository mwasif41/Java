import java.util.*;
public class arraylistTest {
	public static void main(String args[]){
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=1;i<11;i++)
			li.add(i);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to be searched from the list");
		int num= s.nextInt();
		if(li.contains(num))
			System.out.println("From contains method the number is present in the list");
		else
			System.out.println("From contains method the number is not present in the list");
		int index = li.indexOf(num);
		System.out.println("From indexOf method :" + index);
		index = li.lastIndexOf(num);
		System.out.println("From lastIndexOf method :" + index);
		s.close();
	}
}
