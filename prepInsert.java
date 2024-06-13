// prepared statement : insert 

import java.sql.*;
import java.util.*;

class prepInsert
{
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "Rdubey@1911";

			Connection con = DriverManager.getConnection(url,username,password);

			// create a query
			String q = "insert into table1(tName , tCity) values(?,?)";

			//get the prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the name: ");
			String name = sc.nextLine();

			System.out.println("Enter the city: ");
			String city = sc.nextLine();

			//set the values to the query

			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();
			System.out.println("Inserted successfully...");
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}