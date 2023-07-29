package com.pwright.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {

		boolean isValidUserName = username.equalsIgnoreCase("Patrick");
		boolean isValidPassword = password.equalsIgnoreCase("Password");

		return isValidUserName && isValidPassword;
	}

}
