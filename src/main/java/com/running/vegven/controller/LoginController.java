package com.running.vegven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
//	@RequestMapping(value="/login",method = RequestMethod.POST)
//	public String test(ModelMap model,@RequestParam String userId, @RequestParam String password) {
//		if(userId.equals(model.get(getClass()))) {
//			if(password.equals("root")) {
//				return "test";
//			}
//			else {
//				model.put("wrongPassword","請輸入正確密碼");
//				return "login";
//			}
//		}
//		else {
//			model.put("errorMsg","請輸入正確帳號");
//			return "login";
//		}
//	}
}
