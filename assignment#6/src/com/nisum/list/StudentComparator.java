package com.nisum.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

////// student class ////////////////
/** A simple Student class that contains some attributes 
 * @author mwasif
 */
class Student{
	public int age;
	public int rollNo;
	public String name;
	
	/** The constructor of student class and set its attributes given as parameter
	 * @param rollno an integer as roll no of student
	 * @param name a String as name of student
	 * @param age an integer as the age of student
	 */
	Student(int rollno,String name,int age){
		this.rollNo = rollno;
		this.name = name;
		this.age = age;
	}
	
}
/////////////////////////////////////////

/**
 * This class is the StudentComparator Class that is implements Comparator interface 
 * @author mwasif
 *
 */
class StudentComparator implements Comparator<Student>{
	/** it first commpare the name and on name collision it compares the age of student
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * 
	 */
	public int compare(Student student1,Student student2){ // overriding compare method of comparator
		int result = student1.name.compareTo(student2.name); // comparing string
		if(result == 0){ // if strings are same
			if(student1.age>student2.age)   // then age comparator
				return 1;
			else if(student1.age<student2.age)
				return -1;
			else
				return 0;
		}
		else{
			return result; // else result of name comparision
		}
	}
	
	/**
	 * The main method to check the implemented comparator
	 * @see Collections#sort(java.util.List, Comparator)
	 */
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1,"wasif",22));
		studentList.add(new Student(2,"wasif",23));
		studentList.add(new Student(5,"wasif",24));
		studentList.add(new Student(3,"junaid",24));
		studentList.add(new Student(4,"asher",18));
		Collections.sort(studentList,new StudentComparator());
		System.out.println("Sorted objects of students are :");
		for(Student givenStudent: studentList){
			System.out.println(" Roll no: " + givenStudent.rollNo + " Name: " + givenStudent.name + " Age: " + givenStudent.age);
		}
	}
}

