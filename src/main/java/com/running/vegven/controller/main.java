package com.running.vegven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class main {
	@GetMapping("/main")
	public String main() {
		return "main";
	}
}
