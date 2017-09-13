package com.nisum.jdbc;
import com.nisum.dao.StudentDao;
import java.util.Scanner;
/**
 * This class asks the user for roll no and then fetches the data from
 * MySQL DB and then display from the user. 
 * <p>
 * it make use of two tables to fetch the complete data from the database
 * @author mwasif
 *
 */
public class Main {	
	/**
	 * It make a Connection object and then a Statement object
	 * after making as statement object it executes the query and 
	 * returns the resultsetthat is being printed
	 */
	public static void main(String args[]){
			StudentDao studentdao  = new StudentDao();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the roll no be searched");
			int rollNo = scanner.nextInt();
			studentdao.getStudentFromRollNo(rollNo);
			scanner.close();
	}
}
