package com.v1.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DispacherServ {
	
	
	//@GetMapping("/")
	public String welcome() {
		
		return "index";
	}
}
