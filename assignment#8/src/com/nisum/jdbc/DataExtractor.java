package com.nisum.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**DataExtractor class is the class that implements the
 * uses jdbc and retrieve all the data from a table and 
 * display it on console
 * @author mwasif
 *
 */
public class DataExtractor {

	public static void main(String[] args) {
		try{
			System.out.println("loading driver");
			Class.forName("com.mysql.jdbc.Driver");
			final String url = "jdbc:mysql://localhost:3306/employee";
			final String user = "root";
			final String pass = "1234";
			System.out.println("Connecting to DB");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			System.out.println("retrieved data" + rs);
			
			while(rs.next()){
				System.out.println("ID :" + rs.getInt("id") + " Name :  " + rs.getString(2) + " Age : " + rs.getInt(3));
			}

			System.out.println("closing connection");
			rs.close();
			stmt.close();
			con.close();
		
		}catch(Exception e){e.printStackTrace();}
	}

}
