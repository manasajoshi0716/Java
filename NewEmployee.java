package com.test.employee;

import java.sql.*;

public class NewEmployee {
	
	public NewEmployee(String emp_id, String emp_name, String emp_post, String address, String city, String salary ) {
		
		String url = "jdbc:mysql://localhost:3306/Manasa";
		String username = "root";
		String password = "Man$y16";
		
		
			
		try{
			//Creating connection with the database
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Creating a statement
			Statement stmt = con.createStatement();
			
			//Executing the query
			String sql = "insert into Employee"
					+ " values('"+emp_id+"', '"+emp_name+"', '"+emp_post+"', '"
					+address+"', '"+city+"', '"+salary+"');";
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			con.close();
			
			System.out.println("Insertion complete");
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}

}
