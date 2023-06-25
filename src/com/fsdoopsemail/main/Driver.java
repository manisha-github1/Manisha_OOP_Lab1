package com.fsdoopsemail.main;

import java.util.Scanner;

import com.fsdoopsemail.services.*;


import com.fsdoopsemail.model.*;

public class Driver {

     public static Scanner scanner =  new Scanner( System.in );

	public static void main(String[] args) {
		
		
		Employee employee = new Employee("manisha","paliwal");
		 
		displayMenu();
		int option = scanner.nextInt();
		System.out.println(option);		
		String[] departmentMappings = {"tech","admin","hr","legal"};
		String selectDepartments = departmentMappings[option-1];
		
		CredentialService credentialService = new CredentialService();
		String emailAddress = credentialService.generateEmailAddress(employee, selectDepartments);
		System.out.println("Print email addresss "+emailAddress);
		
		String password = credentialService.generatePassword();
		System.out.println("Print password "+password);
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		System.out.println( "" );
		credentialService.showCredentials(employee);

	}

	private static void displayMenu() {
	
		System.out.println("Please Enter the Departments from the followings ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
	    System.out.println("4. Legal");
	}

}
