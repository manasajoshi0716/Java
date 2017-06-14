package com.test.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Employee {
	
	public static void main(String[] args) throws IOException {
		
		String emp_id;
		String emp_name;
		String emp_post;
		String address;
		String city; 
		String salary;
		String query;
		
		NewEmployee newEmployee;
		UpdateEmployee update;
		DeleteEmployee delete;
		GetDetails details;
		EmployeeList list;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Make a Choice: ");
		System.out.println("1. To Enter new Employee");
		System.out.println("2. To update an Employee");
		System.out.println("3. Delete a Record");
		System.out.println("4. To get Employee Details");
		System.out.println("5. To get list of Employees");
		
		int userChoice = sc.nextInt();
		
		switch(userChoice){
		case 1: System.out.println("Enter the follwoing details");
				System.out.print("Employee ID: ");
				emp_id = br.readLine();
				System.out.print("Employee Post: ");
				emp_post = br.readLine();
				System.out.print("Address: ");
				address = br.readLine();
				System.out.print("city: ");
				city = br.readLine();
				System.out.print("Salary: ");
				salary = br.readLine();
				System.out.print("Employee Name: ");
				emp_name = br.readLine();
				newEmployee = new NewEmployee(emp_id,emp_name, emp_post, address, city, salary );
				break;
				
		case 2: System.out.println("Please enter your query");
				query = br.readLine();
				update = new UpdateEmployee(query);
				break;
		
		case 3: System.out.println("Enter the name of the Employee to delete");
				emp_name = br.readLine();
				delete = new DeleteEmployee(emp_name);
				break;
				
		case 4: System.out.println("Enter the employeeID to get the details");
				emp_id = br.readLine();
				details = new GetDetails(emp_id);
				break;
		
		case 5: System.out.println("List of Employees:");
				list = new EmployeeList();
				break;
		}
		
		
	}
}
