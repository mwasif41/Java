import java.sql.*;
import java.util.Scanner;
public class retrieveDataFrom2tables {
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
