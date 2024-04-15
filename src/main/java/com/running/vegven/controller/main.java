package com.running.vegven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	

}
