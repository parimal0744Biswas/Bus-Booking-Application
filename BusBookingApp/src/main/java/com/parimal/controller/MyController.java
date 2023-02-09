package com.parimal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/abc")
	public String getData()
	{
		return "Parimal";
	}

}
