package com.ng2boot.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/api/hello")
	public String greet() {
		return "Hello from the other side!!!";
	}
}
