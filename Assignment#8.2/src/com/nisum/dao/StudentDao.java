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
	 * @param rollNo rollno of student
	 */
	public void getStudentFromRollNo(int rollNo){
		Connection conn = getConnection();
		try{
			Statement stmt = conn.createStatement();
			String query = "select s.rollno,s.name,c.courses from student s,course c where s.rollno=c.rollno AND s.rollno="+rollNo+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				System.out.println("Rollno :" + rs.getInt("rollno") + " Name: "+ rs.getString("name") + " courses :" + rs.getString("courses"));
			}
			conn.close();
		}catch(Exception exception){
			exception.printStackTrace();
		}
		
	}
}
