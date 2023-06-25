package com.fsdoopsemail.services;

import java.util.Random;

import com.fsdoopsemail.interfaces.*;
import com.fsdoopsemail.model.Employee;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		
		//Generate an email with the following syntax firstNamelastName@department.company.com
		
		return employee.getFirstName()+employee.getLastName()+"@"+department+".company.com";
		
	}

	@Override
	public String generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numberLetters = "0123456789";
		String specialLetters = "!@$%^&*()<>?_+-,./";
		String values = capitalLetters+smallLetters+numberLetters+specialLetters  ;
		Random random = new Random();
		String password  = "";
		
		String capChar =   String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
		String smlChar = 	String.valueOf(smallLetters.charAt(random.nextInt(smallLetters.length())));
		String numChar= 	String.valueOf(numberLetters.charAt(random.nextInt(numberLetters.length())));
		String splChar = 	String.valueOf(specialLetters.charAt(random.nextInt(specialLetters.length())));
	    
		password = capChar +smlChar + numChar + splChar;
		
		for( int i = 0; i < 4; i++ ) {
			
			password = password + String.valueOf(values.charAt(random.nextInt(values.length()))); 
		}
		
		return password;
	}

	public void showCredentials(Employee employee) {
	
		String credential ="";
		System.out.println( "Dear " + employee.getFirstName()+  ", here are your credentials..." );
		System.out.println( "Email : " +employee.getEmail() );
		System.out.println( "Password : " + employee.getPassword() );
	}

	@Override
	public void showCredentials(Employee employee, String password, String email) {
		// TODO Auto-generated method stub
		
	}
	
	}


