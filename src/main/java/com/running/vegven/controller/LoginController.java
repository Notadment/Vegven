package com.running.vegven.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.running.vegven.dao.LoginJPADao;
import com.running.vegven.model.Userinf;
import com.running.vegven.service.impl.LoginJPASurvice;
import com.running.vegven.service.impl.RegesterJPASurviceImpl;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	LoginJPADao jpaLoginJPADao;
	RegesterJPASurviceImpl regesterJPASurviceImpl;
	@Autowired
	public LoginController(RegesterJPASurviceImpl regesterJPASurviceImpl) {
		super();
		this.regesterJPASurviceImpl = regesterJPASurviceImpl;
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	// 一般的登入邏輯
	@PostMapping("/userLogin")
	public String test(ModelMap model,@RequestParam String account, @RequestParam String password) {
		Userinf checkAccount = regesterJPASurviceImpl.findByAccount(account);
		Userinf checkPassword = regesterJPASurviceImpl.findByPassword(password);
		BCryptPasswordEncoder checkPw = new BCryptPasswordEncoder();
		System.out.println(checkPassword.toString());
		if(checkAccount == null) {
			model.put("errorMsg","請輸入正確帳號");
			return "login";
		}
		if(!checkPw.matches(password, checkPassword.toString())) {
			model.put("wrongPassword","請輸入正確密碼");
			return "login";
		}
		else {
			return "main";
		}
	}
	//加上spring security JWT邏輯
//	@PostMapping("/userLogin")
//	public String test(HttpSession httpSession,ModelMap model,@RequestParam String account, @RequestParam String password, HttpServletResponse res) {
//		
//			
//		Userinf checkAccount = regesterJPASurviceImpl.findByAccount(account);
//		Userinf checkPassword = regesterJPASurviceImpl.findByPassword(password);
//		BCryptPasswordEncoder checkPw = new BCryptPasswordEncoder();
//		System.out.println(checkPassword.toString());
//		if(checkAccount == null) {
//			model.put("errorMsg","請輸入正確帳號");
//			return "login";
//		}
//		if(!checkPw.matches(password, checkPassword.toString())) {
//			model.put("wrongPassword","請輸入正確密碼");
//			return "login";
//		}
//		else {
//			try {
//				Userinf user = new Userinf();
//				Map<String, Object> claims = new HashMap<String, Object>();
//				claims.put("account", user.getAccount());
//				String inputJwt = JwtUtil.generateJwt(claims);
//				System.out.println(inputJwt);
//				Map<String, String> resBody = new HashMap<String, String>();
//				resBody.put("token", inputJwt);
//				httpSession.setAttribute("account", user.getAccount());
//				Cookie userCookie = new Cookie("token", inputJwt);
//				userCookie.setHttpOnly(true);
//				res.addCookie(userCookie);
//				
//				return "main";
//			}
//			catch (Exception e) {
//					e.printStackTrace();
//					model.put("exceptionErr", "發生未知錯誤，請重新整理後重新輸入");
//					return "login";
//			}
//		}
//	}
}
