package com.jdbc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	@GetMapping(value="/admin")
	public String admin() {
		return "Welcome to Admin:";
	}
	@GetMapping(value="/user")
	public String user() {
		return "Welcome to User";
	}
	@GetMapping(value="/")
	public String welocme() {
		return "Welcome to home Page";
	}
}
