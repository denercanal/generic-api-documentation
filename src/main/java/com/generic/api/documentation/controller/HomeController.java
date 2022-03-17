package com.generic.api.documentation.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping( "home" )
public class HomeController {

	@GetMapping( "/" )
	public String get() {
		return "Hello World";
	}

}
