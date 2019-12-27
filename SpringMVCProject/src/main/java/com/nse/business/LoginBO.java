package com.nse.business;


import org.springframework.stereotype.Service;

@Service
public class LoginBO {
	
	public boolean validateLogin(String username, String password)
	{
		boolean validUser = false;
		if(username.equalsIgnoreCase("rahul") && password.equalsIgnoreCase("test"))
		{
			validUser = true;
		}
		return validUser;
	}

}
