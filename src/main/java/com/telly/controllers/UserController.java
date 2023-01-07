package com.telly.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telly.service.ReserveService;
import com.telly.service.UserService;



@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	ReserveService reserveService;

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

}



