package com.fsdoopsemail.interfaces;

import com.fsdoopsemail.model.*;

public interface ICredentials {
	
	
	public String generateEmailAddress(Employee employee,String department);
	public String generatePassword();
	public void showCredentials(Employee employee,String password, String email);
	
	
}
