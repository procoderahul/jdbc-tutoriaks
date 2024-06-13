import java.sql.*;
import java.io.*;
class imageSave{
	public static void main(String[] args){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "Rdubey@1911";

			Connection con = DriverManager.getConnection(url,username,password);

			String q = "insert into images(pic) values(?)"; 

			PreparedStatement pstmt = con.prepareStatement(q);

			FileInputStream fis = new FileInputStream("r6.jpg");

			pstmt.setBinaryStream(1, fis, fis.available());

			pstmt.executeUpdate();

			System.out.println("Image inserted.... ");
		}
		catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File error.");
            e.printStackTrace();
        }
	}
}