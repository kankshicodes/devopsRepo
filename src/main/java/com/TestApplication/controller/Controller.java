package com.TestApplication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	
	
	
	@GetMapping("/devops-msg")
	public String getMessage()
	{
		return "welcome to jenkins assg";
	}
	
	

}
