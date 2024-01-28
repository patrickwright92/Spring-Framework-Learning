package com.pwright.learningspringsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultSecurityResource {
	
	//Basic Authentication not recommended for production use, easily able to be decoded
	
	@GetMapping("/default-security")
	public String DefaultSecurity() {
		return "Default Spring Security Configuration";
	}

}
