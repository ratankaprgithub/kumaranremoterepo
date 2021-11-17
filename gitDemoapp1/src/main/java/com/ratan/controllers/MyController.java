package com.ratan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String launchHome() {
		return "home";
	}
	
	
	@GetMapping("/welcome")
	public String welcomeLanuncer() {
		return "welcome";
	}

}
