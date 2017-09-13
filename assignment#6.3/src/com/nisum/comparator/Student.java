package com.nisum.comparator;


//////student class ////////////////
/** A simple Student class that contains some attributes 
* @author mwasif
*/
class Student{

	public int rollNo;
	public String name;
	public int age;

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

	/**A get method of age
	 * @return age of student
	 */
	public int getAge() {
	return age;
	}
	/**A set method of age
	 * @param age of student
	 */
	public void setAge(int age) {
	this.age = age;
	}

	/**A get method of rollno
	 * @return rollno of student
	 */
	public int getRollNo() {
	return rollNo;
	}	
	/**A set method of rollno
	 * @param rollno of student
	 */
	public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
	}

	/**A get method of name
	 * @return name of student
	 */
	public String getName() {
	return name;
	}
	/**A set method of name
	 * @param name of student
	 */
	public void setName(String name) {
	this.name = name;
	}


}
/////////////////////////////////////////
