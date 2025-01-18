package com.v1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomePage {

	
	public String welcomeHandler() {
		
		return "index";
	}
}
