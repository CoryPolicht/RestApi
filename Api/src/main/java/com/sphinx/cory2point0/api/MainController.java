package com.sphinx.cory2point0.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "Hello from Spring";
	}

}
