package com.cts.MicroServiceSample1SDET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHello()
	{
		return "Welcome to Microservices using SpringBoot";
	}
}
