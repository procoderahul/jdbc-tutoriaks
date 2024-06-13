import java.sql.*;
import java.util.*;

class selectJDBC
{
	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username = "root";
		String password = "Rdubey@1911";

		Connection con = DriverManager.getConnection(url,username,password);

		String q = "Select * from table1" ;

		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery(q);

		while(set.next())
		{
			int id = set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);

			System.out.println(id + ":" + name + ":" + city);

			con.close();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}