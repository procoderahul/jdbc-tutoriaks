import java.sql.*;
class insertJDBC
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

			//creation of a query
			String q = "create table table1(tID int(20) primary key auto_increment, tName varchar(20) not null ,tCity varchar(400) )";

			//creation of a statement

			Statement stmt =  con.createStatement();

			stmt.executeUpdate(q);

			System.out.println("table created successfully in the database....");

			con.close();
		}

		catchk(Exception e)
		{
			e.printStackTrace();
		}
	}
}