package com.nisum.comparator;

import java.util.Comparator;

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
	
	
}

