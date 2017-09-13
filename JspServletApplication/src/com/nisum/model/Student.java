package com.nisum.model;

/**Student class is the representation of the student object
 * @author mwasif
 *
 */
public class Student {
	
	private int id;
	private String name;
	private int rollNo;
	private String department;
	private String email;
	
	// a constructor 
	
	/**A custom constructor of Student class
	 * @param name name of the student
	 * @param rollNo roll no of the student
	 * @param department department of the student
	 * @param email email of the student
	 */
	public Student(String name,int rollNo,String department,String email){
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
		this.email = email;
	}
	
	// getter and setter for Student class
	/**It is used to set the id of student
	 * @param id unique id of the student
	 */
	public void setId(int id){
		this.id=id;
	}
	/**It is used to set the name of student
	 * @param name Name of the student
	 */
	public void setName(String name){
		this.name=name;
	}
	/**It is used to set the roll no of student
	 * @param rollNo rollNo of the student
	 */
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}
	/**It is used to set the email of student
	 * @param email email of the student
	 */
	public void setEmail(String email){
		this.email=email;
	}
	/**It is used to set the department of student
	 * @param department department of the student
	 */
	public void setDept(String department){
		this.department=department;
	}
	
	/**To get the id of the student
	 * @return a unique id of student
	 */
	public int getId(){
		return id;
	}
	/**To get the name of the student
	 * @return name of the student
	 */
	public String getName(){
		return name;
	}
	/**To get the email of the student
	 * @return Email of the student
	 */
	public String getEmail(){
		return email;
	}
	/**To get the department of the student
	 * @return department of the student
	 */
	public String getDept(){
		return department;
	}
	/**To get the roll no  of the student
	 * @return roll no of the student
	 */
	public int getRollNo(){
		return rollNo;
	}
	
}
