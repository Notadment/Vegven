package com.running.vegven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.running.vegven.model.Production;
import com.running.vegven.service.impl.mainJPAService;

@Controller
public class main {
	@Autowired
	private mainJPAService mainJPAService;
	
	@GetMapping("/main")
	public String main(Model model) {
		List<Production> products = mainJPAService.getAllProductions();
		model.addAttribute("products", products);
		return "main";
	}
}
