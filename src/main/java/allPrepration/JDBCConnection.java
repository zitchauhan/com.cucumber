package allPrepration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {

		try {
			String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=mydatabase";
			String username = "your_username";
			String password = "your_password";

			Class.forName("");
			try {

				Connection con = DriverManager.getConnection(jdbcUrl, username, password);

				Statement s = con.createStatement();

				ResultSet rs = s.executeQuery("select * from query ");

				con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
