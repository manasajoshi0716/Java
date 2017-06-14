package com.test.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteEmployee {

	public DeleteEmployee(String emp_name){
		
		String url = "jdbc:mysql://localhost:3306/Manasa";
		String username = "root";
		String password = "Man$y16";
		
		
		try{
			//Creating connection with the database
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Creating a statement
			Statement stmt = con.createStatement();
			
			//Executing the query
			String sql = "delete from Employee where Emp_name = '"+emp_name+"';";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			con.close();
			
			System.out.println("The required record is deleted");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
}
