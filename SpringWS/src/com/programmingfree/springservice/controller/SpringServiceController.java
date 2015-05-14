package com.programmingfree.springservice.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class SpringServiceController {
	@RequestMapping(value = "/{userName}/{password}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String userName, @PathVariable String password) {
		String result="Hello "+userName+"::::"+password;		
		return result;   
	}
}