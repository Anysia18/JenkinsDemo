package com.anysia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/welcome")
	public String welcomer() {
		return "welcome";
	}
}
