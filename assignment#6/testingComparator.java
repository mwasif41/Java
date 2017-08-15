import java.util.*;
////// student class ////////////////
class student{
	public int age;
	public int rollno;
	public String name;
	
	student(int rollno,String name,int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
}
/////////////////////////////////////////
///////// a comparator to compare students
class studentComparator implements Comparator<student>{
	public int compare(student s1,student s2){ // overriding compare method of comparator
		int temp = s1.name.compareTo(s2.name); // comparing string
		if(temp == 0){ // if strings are same
			if(s1.age>s2.age)   // then age comparator
				return 1;
			else if(s1.age<s2.age)
				return -1;
			else
				return 0;
		}
		else{
			return temp; // else result of name comparision
		}
	}
}



public class testingComparator {

	public static void main(String[] args) {
		ArrayList<student> al = new ArrayList<student>();
		al.add(new student(1,"wasif",22));
		al.add(new student(2,"wasif",23));
		al.add(new student(5,"wasif",24));
		al.add(new student(3,"junaid",24));
		al.add(new student(4,"asher",18));
		Collections.sort(al,new studentComparator());
		System.out.println("Sorted objects of students are :");
		for(student s: al){
			System.out.println(" Roll no: " + s.rollno + " Name: " + s.name + " Age: " + s.age);
		}
	}

}
