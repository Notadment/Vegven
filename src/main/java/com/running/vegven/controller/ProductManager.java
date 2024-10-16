package com.running.vegven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductManager {
	@GetMapping("/productManager")
	public String productManager() {
		return "productManager";
	}
}