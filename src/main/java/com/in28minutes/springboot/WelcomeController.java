package com.in28minutes.springboot;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.service.WelcomeService;

@RestController
public class WelcomeController {
	
	//Injected here
	@Autowired
	private WelcomeService service;	
	
	@RequestMapping("/welcome")
//	@ResponseBody
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
}

//Spring to manage this bean and create an instance of this 

