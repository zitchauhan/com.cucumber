package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JdbcClass

{

	@Test
	private void jdbcconnection()

	{
		//String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=JdbcTest;trustServerCertificate=true;integratedSecurity=true";
		
		String connectionUrl = "jdbc:sqlserver://localhost:1433;trustServerCertificate=true;integratedSecurity=true";
		
		//String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabase;integratedSecurity=true;";
		/*  if no user name and password 
		String userName = "LAPTOP-8FI90IP6\\zitch";
		String password = "";

*/
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement statement =		connection.createStatement();
			
			String sqlQuery  = "Select * from Locators";
					
			ResultSet resultSet		 = statement.executeQuery(sqlQuery);
			
			
			while (resultSet.next())
				
			{
			String  columnValue	= resultSet.getString("LocatorValue");
				System.out.println(columnValue);
			}
			
			resultSet.close();
			statement.close();
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
