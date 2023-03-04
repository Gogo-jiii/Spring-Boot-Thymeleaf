package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@Controller
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/about")
	public String about(org.springframework.ui.Model model) {
		model.addAttribute("name", "abcd");
		model.addAttribute("age", 50);
		return "about";
	}
}
