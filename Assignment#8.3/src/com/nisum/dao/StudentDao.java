package com.nisum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**The class is used to serve as a data access object in the project
 * @author mwasif
 *
 */
public class StudentDao {
	
	/**This method is used to get the connection of mysql using JDBC
	 * @return Connection of MYSQL
	 */
	public Connection getConnection(){
		Connection connection = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/my";
			connection = DriverManager.getConnection(url, "root", "1234");
		}catch(Exception exception){exception.printStackTrace();}
		
		return connection;
	}
	
	/**This methods prints the detail of the student that is being fetched by JDBC
	 * @param rollNo rollno of the student
	 * @param Name name of the student
	 */
	public void getStudentFromRollNoAndName(int rollNo,String Name){
		Connection connection = getConnection();
		try{
		String query = "SELECT * FROM student where rollno = "+rollNo+" AND name='"+Name+"';";
		Statement statement =connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		while(resultSet.next()){
				System.out.println("Roll NO : " + resultSet.getInt("rollno") + " Name: " + resultSet.getString("name") + " Department : " + resultSet.getString(3) + " MSain Course: " + resultSet.getString(4));
			}
		connection.close();
		statement.close();
		resultSet.close();
		}catch(Exception e){
		e.printStackTrace();
	    }
	}
}
