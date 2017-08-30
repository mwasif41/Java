package com.nisum.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/**
 * This class asks the user for roll no and then fetches the data from
 * MySQL DB and then display from the user. 
 * <p>
 * it make use of two tables to fetch the complete data from the database
 * @author mwasif
 *
 */
public class DataExtractor2 {
	
	/**
	 * It make a Connection object and then a Statement object
	 * after making a statement object it executes the query and 
	 * returns the resultsetthat is being printed
	 */
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			final String url = "jdbc:mysql://localhost:3306/my";
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			Statement stmt = conn.createStatement();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the roll no be searched");
			int rollno = s.nextInt();
			String query = "select s.rollno,s.name,c.courses from student s,course c where s.rollno=c.rollno AND s.rollno="+rollno+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.println("Rollno :" + rs.getInt("rollno") + " Name: "+ rs.getString("name") + " courses :" + rs.getString("courses"));
			}
		
			s.close();
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){e.printStackTrace();}
	}
}
