package com.nisum.abstraction;

/**
 * This is the abstract class of Person 
 * @author mwasif
 * 
 */

abstract public class Person {
	protected String name;
	protected int age;

	
	/**set method of name
	 * @param name this is the name to be stored in the name field
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**set method of age
	 * @param age this is the age to be stored in the age field
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**get method of name
	 * @return String that is the name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 **get method of age
	 * @return it returns the age of the person
	 */
	public int getAge() {
		return age;
	}

	/**
	 * an abstract method that would be override by child class
	 */
	abstract void giveIntroduction();

}
