package com.shittu24.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
@RequestMapping("/api/v1/basic")
@Hidden
public class BasicController {
	
	@GetMapping
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello World from a secured location!",
				HttpStatus.OK);
	}

}
