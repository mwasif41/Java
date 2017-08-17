import java.sql.*;
import java.util.Scanner;
public class retrieveDataFromInput {
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			final String url ="jdbc:mysql://localhost:3306/my";
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the roll no of student to be searched");
			int r = s.nextInt();
			s.nextLine();
			System.out.println("Enter the name of student to be searched");			
			String name = s.nextLine();
			System.out.println(name);
			
			String query = "SELECT * FROM student where rollno = "+r+" AND name='"+name+"';";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
					System.out.println("Roll NO : " + rs.getInt("rollno") + " Name: " + rs.getString("name") + " Department : " + rs.getString(3) + " MSain Course: " + rs.getString(4));
					
				}
			s.close();
			conn.close();
			stmt.close();
			rs.close();
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
