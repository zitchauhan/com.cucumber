package com.cucumber;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnector {
	public Connection getConnection()  {
		Connection connection =null;
		try {
			//Load MySQL JDBC Driver
			Class.forName("org.postgresql.Driver");			
			connection=DriverManager
					.getConnection("jdbc:postgresql://34.70.29.208:5432/kdp_lid_recognition","postgres", "root");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public ResultSet executeQuery(Connection connection,String sql)  {
		ResultSet rs=null;
		try {
			Statement st = connection.createStatement();
			System.out.println("Connection");
			// Executing the SQL Query and store the results in ResultSet
			rs= st.executeQuery(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}