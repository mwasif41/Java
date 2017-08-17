import java.sql.*;
public class retrieveData {

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
