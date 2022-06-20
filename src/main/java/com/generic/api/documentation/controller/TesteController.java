package com.generic.api.documentation.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.api.documentation.controller.dto.TesteDTO;
import com.generic.api.documentation.controller.dto.TesteFilter;

@RestController
@CrossOrigin
@RequestMapping( "teste" )
public class TesteController {

	@GetMapping( "/" )
	public TesteDTO getAll() {
		return null;
	}

	@GetMapping( "/{id}" )
	public TesteDTO getById( @PathVariable( "id" ) Long id ) {
		return null;
	}

	@PostMapping( "search" )
	public TesteDTO search( @RequestBody TesteFilter testeFilter ) {
		return null;
	}
}
