package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection con=null;
	public  static Connection con()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_behaviour", "root", "root");
			System.out.println("fff");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
