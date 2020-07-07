package test;

import java.sql.*;

public class TestConnection {

	public static void main(String... args) {
		
		Connection con;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers Loaded");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "eminemshow@123");
			System.out.println("Connection established");
			
			con.close();
			System.out.println("Connection closed");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Exception " + e.getMessage());
		
		} catch (SQLException e) {
			System.out.println("Exception " + e.getMessage());
		}
		
	}

}
