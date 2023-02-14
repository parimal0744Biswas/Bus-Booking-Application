package com.parimal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/abc")
	public ResponseEntity<String> getData()
	{
		return new ResponseEntity<>("Parimal", HttpStatus.ACCEPTED);
	}

}
