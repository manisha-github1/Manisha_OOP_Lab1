package com.labone.main;

import java.util.Scanner;

import com.labone.model.*;
import com.labone.service.*;

public class Driver {
	/**
	 * main
	 */
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		// Step 2
		/**
		 * Accept firstName, lastName, department as input from terminal
		 */
		System.out.println( "First name : " );
		String firstName = sc.next();
		
		System.out.println( "Last name : " );
		String lastName = sc.next();
		
		System.out.println( "Choose your department (1 - 4)" );
		System.out.println( "1. Technical" );
		System.out.println( "2. Admin" );
		System.out.println( "3. Human Resources" );
		System.out.println( "4. Legal" );
		
		int choice = sc.nextInt();
		
		/**
		 * Create employee object (emp)
		 * Alternative to using switch..case to get dept code - We can use HashMap<Integer,String> and populate with (choice, deptCode)
		 */
		String dept;
		
		switch( choice ) {
			case 1:
				dept = "tech";
				break;
			case 2:
				dept = "adm";
				break;
			case 3:
				dept = "hr";
				break;
			case 4:
				dept = "lg";
				break;
			default:
				System.out.println( "Incorrect choice" );
				return;
		}
		
		Employee emp = new Employee( firstName, lastName, dept );
		
		/**
		 * Step 3
		 * Create an object of the CredentialsService (cs)
		 */
		CredentialsService cs = new CredentialsService(); 
		
		/**
		 * Use cs to...
		 * Step 3b
		 * Generate email and store it
		 */
		String email = cs.generateEmailAddress( emp );
		System.out.println( "Email : " + email );
		
		/**
		 * 
		 * Step 4b
		 * Generate password and store it
		 * 
		 * Step 5b
		 * Show the credentials
		 */
		String password = cs.generatePassword();
		System.out.println( " password : " + password);
		// sc.close();
	}
}
