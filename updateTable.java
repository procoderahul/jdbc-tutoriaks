import java.sql.*;
import java.util.*;

class updateTable
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username = "root";
		String password = "Rdubey@1911";

		Connection con = DriverManager.getConnection(url,username,password);

		String q = "update table1 set tName =? , tCity = ? where tId = ?";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a new name: ");
		String name = sc.nextLine();

		System.out.println("Enter new city: ");
		String city = sc.nextLine();

		System.out.println("Enter the student id: ");
		int id = Integer.parseInt(sc.nextLine());


		PreparedStatement pstmt = con.prepareStatement(q);

		pstmt.setString(1 , name); 
		pstmt.setString(2 , city); 
		pstmt.setInt(3 , id);

		pstmt.executeUpdate();

		System.out.println("table updated....");

		con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}