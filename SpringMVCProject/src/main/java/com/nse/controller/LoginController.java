package com.nse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nse.business.LoginBO;

@Controller
public class LoginController {
	
	@Autowired
	LoginBO loginBO;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin()
	{
		System.out.println("In the getLogin");
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateLogin(@RequestParam String name,@RequestParam String password,  ModelMap model)
	{
		System.out.println("In the validateLogin with login:"+name);
		if(loginBO.validateLogin(name, password))
		{
			model.put("name", name);
			return "welcome";
		}else
		{
			model.put("errorMessage", "Invalid Username or Password");
			return "login";
		}
		
	}

}
