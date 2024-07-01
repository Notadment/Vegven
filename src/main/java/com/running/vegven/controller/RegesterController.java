package com.running.vegven.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.running.vegven.model.Userinf;
import com.running.vegven.service.RegesterService;


@Controller
public class RegesterController {
	RegesterService regesterService;
	@Autowired
	public RegesterController(RegesterService regesterService) {
		this.regesterService = regesterService;
	}
	
//	@RequestMapping(value="/regester",method = RequestMethod.GET)
//	public String regester() {
//		return "regester";
//	}
	
	@PostMapping("/testRegester")
	@ResponseBody
	public String regester(ModelMap model, @RequestParam String userId, Userinf userinf) {
//		String reg = "/^(?-.*[A-Z])(?-.*[a-z])(?-.*[0-9])[A-Za-z0-9_]{8-16}$/";
//		Pattern pattern = Pattern.compile(reg);
//		Matcher matcher = pattern.matcher(userId);
//		if(matcher.find()) {
//			if(userId.equals(userinf.getAccount())) {
//				
//			}
//		}
		return "regester";
	}
	
	@RequestMapping(value="/verifyAccount",method = RequestMethod.POST)
	@ResponseBody
	public String verifyAccount(@RequestParam String account) {
		String reg = "^[A-Za-z0-9]{8,16}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(account);
		if(matcher.matches()==false) {
			
//			model.put("errorAccount", "請按照正確格式輸入");
//			System.out.println(matcher.matches());
			return "errorMatchAccount";
		}else {
			Userinf userinf = regesterService.selectAccount(account);
			if(userinf != null) {
//				model.put("sameAccount", "已有相同帳戶名稱");
				return "errorAcount";
			}else {
//				model.put("errorAccount", "此名稱尚未被註冊");
				return  "successAccount";
			}
			
		}
//		return "regester";
	}
	
	@RequestMapping(value="/verifyPassword",method = RequestMethod.POST)
	@ResponseBody
	public String verifyPassword(@RequestParam String password) {
		String reg = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,16}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(password);
		if(matcher.matches()==false) {
			
//			model.put("errorAccount", "請按照正確格式輸入");
//			System.out.println(matcher.matches());
			return "errorMatchPassword";
		}else {
			Userinf userinf = regesterService.selectPassword(password);
			if(userinf == null) {
//				model.put("sameAccount", "已有相同帳戶名稱");
				return "successPassword";
			}else {
//				model.put("errorAccount", "此名稱尚未被註冊");
				return  "errorPassword";
			}
			
		}
//		return "regester";
	}
//	
	@RequestMapping(value="/verifyEmail",method = RequestMethod.POST)
	@ResponseBody
	public String verifyEmail(@RequestParam String email) {
		String reg = "^[0-9a-zA-Z]+@gmail\\.com$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			String nonEmail = email.replace("@gmail.com", "");
			Userinf userinf = regesterService.selectEmail(email);
			if(userinf == null) {
//			model.put("sameEmail", "密碼已被使用");
				return "sucessEmail";
			}else {
//			model.put("sucessEmail", "此密碼可使用");
				return "sameEmail";
			}
		}else {
			return "errorMatchEmail";
		}
	}
//	
	@RequestMapping(value="/VerifyPhone",method = RequestMethod.POST)
	@ResponseBody
	public String VerifyPhone(@RequestParam String phone) {
		String reg = "^09[0-9]{8}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(phone);
		if(matcher.matches()) {
			Userinf userinf = regesterService.selectPhone(phone);
			if(userinf != null) {
//			model.put("samePhone", "此號碼已被使用");
				return "samePhone";
			}else {
//			model.put("sucessPhone", "號碼可使用");
				return "sucessPhone";
			}
		}else {
			return "errorMatchPhone";
		}
	}
	
	
}
