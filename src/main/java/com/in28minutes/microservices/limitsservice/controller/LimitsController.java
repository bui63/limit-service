package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Value("${limits-service.minimum}")
	private int minimum;
	
	@Value("${limits-service.maximum}")
	private int maximum;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(minimum, maximum);
	}
}
