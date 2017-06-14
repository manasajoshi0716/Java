package com.test.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeList {

	public EmployeeList(){
		
		String url = "jdbc:mysql://localhost:3306/Manasa";
		String username = "root";
		String password = "Man$y16";
		
		
		try{
			//Creating connection with the database
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Creating a statement
			Statement stmt = con.createStatement();
			
			//Executing the query
			String sql = "Select * from Employee;";
			
			//System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			//Retrieving values from the ResultSet
			while(rs.next()){
			String employeeID = rs.getString("Emp_id");
			String employeeName = rs.getString("Emp_Name");
			String employeePost = rs.getString("Emp_post");
			String address = rs.getString("Address");
			String city = rs.getString("City");
			String salary = rs.getString("Salary");
			
			System.out.println("Employee ID : "+employeeID);
			System.out.println("Employee Name : "+employeeName);
			System.out.println("Employee Post : "+employeePost);
			System.out.println("Address : "+address);
			System.out.println("City : "+city);
			System.out.println("Salary : "+salary);
			System.out.println();
	
			}
			rs.close();
			stmt.close();
			con.close();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
