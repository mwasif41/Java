package com.nisum.jdbc;
import com.nisum.dao.EmployeeDao;
/**DataExtractor class is the class that implements the
 * uses jdbc and retrieve all the data from a table and 
 * display it on console
 * @author mwasif
 *
 */
public class Main {
	/** Method is used the data access object
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeDao employeedao = new EmployeeDao();
		employeedao.getAllEmployee();
	}
	
}
