package com.test.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmployee {
	
	public UpdateEmployee(String query){
		
		String url = "jdbc:mysql://localhost:3306/Manasa";
		String username = "root";
		String password = "Man$y16";
		
		
		try{
			//Creating connection with the database
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Creating a statement
			Statement stmt = con.createStatement();
			
			//Executing the query
			String sql = query;
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			con.close();
		
			System.out.println("Updation completed");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}

}
