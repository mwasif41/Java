import java.sql.*;
import java.util.*;
public class StudentMan {
	
	public static Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			final String url = "jdbc:mysql://localhost:3306/new";
			conn = DriverManager.getConnection(url,"root","1234");
		}catch(Exception e){e.printStackTrace();}
		return conn;
	}
	
	public static int addStudent(String n,int r,String  e,String d){
		//Student s = new Student(n,r,e,d);
		int status = 0;
		try{
			Connection conn = StudentMan.getConnection();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Student(name,rollno,email,dept) values(?,?,?,?) ");
			ps.setString(1, n);
			ps.setInt(2, r);
			ps.setString(3, e);
			ps.setString(4, d);
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception ex){ex.printStackTrace();}
		return status;
	}
	
	public static int deleteStudent(int id){
		int status=0;
		try{
			Connection conn = StudentMan.getConnection();
			PreparedStatement ps = conn.prepareStatement("Delete from student where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
		}catch(Exception e){e.printStackTrace();}
		return status;
	}
	
	public static int updateStudent(int id,String n,int r,String e,String d){
		int status=0;
		try{
			Connection conn = StudentMan.getConnection();
			PreparedStatement ps = conn.prepareStatement("update student set name=?,rollno=?,email=?,dept=?  where id=?");
			ps.setString(1, n);
			ps.setInt(2, r);
			ps.setString(3, e);
			ps.setString(4, d);
			ps.setInt(5, id);
			status = ps.executeUpdate();
		}catch(Exception ex){ex.printStackTrace();}
		return status;
	}
	
	public static Student getStudentById(int id){
		Student student = null;
		try{
			Connection conn = StudentMan.getConnection();
			PreparedStatement ps = conn.prepareStatement("Select * from student where id =?");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			//System.out.println(rs.getString("name"));
			if(rs.next()){
			student = new Student(rs.getString("name"),rs.getInt("rollno"),rs.getString("email"),rs.getString("dept"));
			student.setId(rs.getInt("id"));
			}
			conn.close();
		}catch(Exception e){e.printStackTrace();}
	return student;
	}
	
	public static ArrayList<Student> getAllStudents(){
		ArrayList<Student> list = new ArrayList<Student>();
		try{
			Connection conn = StudentMan.getConnection();
			PreparedStatement ps = conn.prepareStatement("Select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Student s = new Student(rs.getString("name"),rs.getInt("rollno"),rs.getString("email"),rs.getString("dept"));
				s.setId(rs.getInt("id"));
				list.add(s);
			}
		}catch(Exception e){e.printStackTrace();}
		return list;
	}
	
	
	
//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//System.out.println(StudentMan.addStudent("wasif", 41, "mohd_wasif555@yahoo.com", "CIS"));
////		System.out.println(StudentMan.updateStudent(2, "Asher", 22, "ss@ee.com", "cc"));
//	System.out.println(StudentMan.updateStudent(6, "wasif", 41, "asdadasd", "CIS"));
//}

}
