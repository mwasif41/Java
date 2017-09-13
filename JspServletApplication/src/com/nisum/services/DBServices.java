package com.nisum.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.nisum.model.Student;

/** The DBServices class is implementation of basic Database 
 * methods for CRUD operaaations
 * @author mwasif
 *
 */
public class DBServices {
	// a method to get a connection of mysql
	/**It is used to make a connection to MYSQL 
	 * @return Connection object of Mysql connection
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		    String url = "jdbc:mysql://localhost:3306/new";
			conn = DriverManager.getConnection(url,"root","1234");
		}catch(Exception exception){exception.printStackTrace();}
		return conn;
	}
	// a method to add student
	/**To add the student in the record
	 * @param name name of the student
	 * @param rollNo roll no of the student
	 * @param department it is the department of student
	 * @param email it is the email of the student
	 * @return status of the query after the execution
	 */
	public static int addStudent(String name,int rollNo,String  department,String email){
		// status is to check the query status
		int status = 0;
		try{
			Connection conn = DBServices.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO Student(name,rollno,email,dept) values(?,?,?,?) ");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, rollNo);
			preparedStatement.setString(3, department);
			preparedStatement.setString(4, email);
			status = preparedStatement.executeUpdate();
			conn.close();
		}catch(Exception exception){exception.printStackTrace();}
		return status;
	}
	// a method to delete a student through his unique ID
	/**To delete the student from DB
	 * @param id it is the ID of student
	 * @return status of the query after the execution
	 */
	public static int deleteStudent(int id){
		// status is to check the query status
		int status=0;
		try{
			Connection conn = DBServices.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("Delete from student where id=?");
			preparedStatement.setInt(1, id);
			status = preparedStatement.executeUpdate();
		}catch(Exception exception){exception.printStackTrace();}
		return status;
	}
	
	/**To update the record of student in the record
	 * @param id unique id of the student
	 * @param name name of the student
	 * @param rollNo roll no of the student
	 * @param department it is the department of student
	 * @param email it is the email of the student
	 * @return status of the query after the execution
	 **/
	public static int updateStudent(int id,String name,int rollNo,String  department,String email){
		//status is to check the query status
		int status=0;
		try{
			Connection conn = DBServices.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("update student set name=?,rollno=?,dept=?,email=?  where id=?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, rollNo);
			preparedStatement.setString(3, department);
			preparedStatement.setString(4, email);
			preparedStatement.setInt(5, id);
			status = preparedStatement.executeUpdate();
		}catch(Exception ex){ex.printStackTrace();}
		return status;
	}
	// get a student object based on ID
	/**To get a student object from the record
	 * @param id the unique id of the student
	 * @return a student that is retrieved from the database
	 */
	public static Student getStudentById(int id){
 		// a null student object
		Student student = null;
		try{
			Connection conn = DBServices.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("Select * from student where id =?");
			preparedStatement.setInt(1,id);
			ResultSet result = preparedStatement.executeQuery();
			if(result.next()){
			student = new Student(result.getString("name"),result.getInt("rollno"),result.getString("email"),result.getString("dept"));
			student.setId(result.getInt("id"));
			}
			conn.close();
		}catch(Exception exception){exception.printStackTrace();}
	return student;
	}
	// return an arrayList of all student 
	/**Retrieve all the record from the list
	 * @return an ArrayList of student
	 */
	public static ArrayList<Student> getAllStudents(){
		// storage for students
		ArrayList<Student> studentList = new ArrayList<Student>();
		try{
			Connection conn = DBServices.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement("Select * from student");
			ResultSet result = preparedStatement.executeQuery();
			while(result.next()){
				Student student = new Student(result.getString("name"),result.getInt("rollno"),result.getString("email"),result.getString("dept"));
				student.setId(result.getInt("id"));
				studentList.add(student);
			}
		}catch(Exception exception){exception.printStackTrace();}
		return studentList;
	}

}
