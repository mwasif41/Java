package com.nisum.jdbc;
import com.nisum.dao.StudentDao;
import java.util.Scanner;
/**
 *  
 * This class asks the user for roll no and name then fetches the data from
 * MySQL DB and then display from the user
 * @author mwasif
 *
 */
public class Main {
	
	/**
	 *  It make a Connection object and then a Statement object
	 * after making a statement object it executes the query and 
	 * returns the result set that is being printed
	 */
	public static void main(String args[]){
		StudentDao studentdao = new StudentDao();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the roll no of student to be searched");
		int rollNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the name of student to be searched");			
		String name = scanner.nextLine();
		studentdao.getStudentFromRollNoAndName(rollNo, name);
		scanner.close();
	}
}
