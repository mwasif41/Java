package com.nisum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**The class is used to serve as a data access object in the project
 * @author mwasif
 *
 */
public class EmployeeDao {
	
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
	
	/**This methods prints all the detail of employee that is being fetched by JDBC
	 * 
	 */
	public void getAllEmployee(){
		Connection connection = getConnection();
		try{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from emp");
			System.out.println("retrieved data" + resultSet);
		
			while(resultSet.next()){
				System.out.println("ID :" + resultSet.getInt("id") + " Name :  " + resultSet.getString(2) + " Age : " + resultSet.getInt(3));
			}

			resultSet.close();
			statement.close();
			connection.close();
			}catch(Exception exception){
				exception.printStackTrace();
			}

	}
}
