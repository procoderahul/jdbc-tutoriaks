import java.sql.*;

class firstJDBC
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "Rdubey@1911";

			Connection con = DriverManager.getConnection(url,username,password);

			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("Connection is established....");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}