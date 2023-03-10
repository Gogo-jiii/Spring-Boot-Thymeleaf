package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("name", "abcd");
		model.addAttribute("age", 50);
		return "about";
	}
	
	@GetMapping("/loop")
	public String loop(Model model) {
		List<String> list = List.of("a", "b", "c", "d");
		model.addAttribute("listData", list);
		return "loop";
	}
	
	@GetMapping("/conditionalStatements")
	public String conditionalStatements(Model model) {
		boolean isActive = true;
		model.addAttribute("isActive", isActive);
		return "conditionalStatements";
	}
	
	@GetMapping("/footer")
	public String footer(Model model) {
		model.addAttribute("title","THIS IS A TITLE");
		return "footer";
	}
	
	@GetMapping("/inheritance")
	public String inheritance() {
		return "inheritancefile";
	}
}
