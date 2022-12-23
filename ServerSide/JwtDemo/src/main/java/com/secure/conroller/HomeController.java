package com.secure.conroller;


import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home(){
		return "hello Everyone";
	}
	@GetMapping("/")
	public String home(Principal princiapl) {
		return "hello and welcome Mr. " +princiapl.getName();
	}

}
