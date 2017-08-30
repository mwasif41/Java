package com.nisum.abstraction;
/**
 * <h2>Employee class</h2>
 * Employee class is an extended class of Person Class
 * <p>
 * This class gives the provide abstraction to person class
 * @author mwasif
 * @see Person   
 * */
class Employee extends Person{
		private double salary;
		
		
		/**This method is the setter method of employee
		 * @param salary set the salary of employee to given salary
		 */
		public void setSalary(double salary){
			this.salary = salary;
		}
		
		/**
		 * getter method for employee
		 * @return double it returns the salary of employee 
		 */
		public double getSalary(){
			return salary;
		}
		
		/**
		 * this method is used to print values of the employee
		 * @see com.nisum.abstraction.Person#giveIntroduction()
		 */
		@Override
		public void giveIntroduction(){
			System.out.println("Name:" + name );
			System.out.println("Age:" + age );
			System.out.println("Salary:" + salary );
		}
		
		
		/** the main method to test the employee class methods
		 * <li>it creates an employee</li>
		 * <li>It set its fields</li>
		 * <li>It calls the giveIntroduction() of Employee</li> 
		 * @param args
		 * */
		public static void main(String[] args) {
			Employee employee = new Employee();
			employee.setAge(12);
			employee.setName("Wasif");
			employee.setSalary(55000);
			employee.giveIntroduction();
		}
}

