package com.nisum.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
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
