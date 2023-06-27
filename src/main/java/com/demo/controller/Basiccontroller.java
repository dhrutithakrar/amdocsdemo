package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Basiccontroller {
	@GetMapping("/get")
	public String getData() {
		return "Welcome to Amdocs";
	}
}
