package com.running.vegven.controller;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.running.vegven.dao.RegesterJPADao;
import com.running.vegven.model.Userinf;
import com.running.vegven.service.impl.RegesterJPASurviceImpl;

import jakarta.servlet.http.Cookie;


@Controller
public class RegesterJPAController {
	
	@Autowired
	RegesterJPADao jpaDao;
	RegesterJPASurviceImpl regesterJPASurviceImpl;
	@Autowired
	public RegesterJPAController(RegesterJPASurviceImpl regesterJPASurviceImpl) {
		super();
		this.regesterJPASurviceImpl = regesterJPASurviceImpl;
	}
	
	@RequestMapping(value="/regester",method = RequestMethod.GET)
	public String regester() {
		return "regester";
	}
	
	
	@PostMapping("/VerifyJPAAccount")
	public ResponseEntity<String> VerifyAccount(@RequestParam String account){
		String reg = "^[A-Za-z0-9]{8,16}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(account);
		if(matcher.matches()==false) {
			
//			model.put("errorAccount", "請按照正確格式輸入");
//			System.out.println(matcher.matches());
			return ResponseEntity.ok("errorMatchAccount");
		}else {
//			Userinf result = regesterJPASurviceImpl.findByAccount(account);
//			if(result != null) {
//				return ResponseEntity.ok("errorAcount");
//			}else {
				return ResponseEntity.ok("successAccount");
//			}
			
		}
	}
	
	@PostMapping("/VerifyJPAPassword")
	public ResponseEntity<String> verifyPassword(@RequestParam String password) {
		String reg = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,16}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(password);
		if(matcher.matches()==false) {
			
//			model.put("errorAccount", "請按照正確格式輸入");
//			System.out.println(matcher.matches());
			return ResponseEntity.ok("errorMatchPassword");
		}else {
			Userinf userinf = regesterJPASurviceImpl.findByPassword(password);
			if(userinf == null) {
//				model.put("sameAccount", "已有相同帳戶名稱");
				return ResponseEntity.ok("successPassword");
			}else {
//				model.put("errorAccount", "此名稱尚未被註冊");
				return  ResponseEntity.ok("errorPassword");
			}
			
		}
//		return "regester";
	}
//	
	@PostMapping("/VerifyJPAMail")
	public ResponseEntity<String> verifyMail(@RequestParam String mail) {
		String reg = "^[0-9a-zA-Z]+@gmail\\.com$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(mail);
		if(matcher.matches()) {
			
			Userinf userinf = regesterJPASurviceImpl.findByMail(mail);
			if(userinf == null) {
//			model.put("sameEmail", "密碼已被使用");
				return ResponseEntity.ok("sucessEmail");
			}else {
//			model.put("sucessEmail", "此密碼可使用");
				return ResponseEntity.ok("sameEmail");
			}
		}else {
			return ResponseEntity.ok("errorMatchEmail");
		}
	}
//	
	@PostMapping("/VerifyJPAPhone")
	public ResponseEntity<String> VerifyPhone(@RequestParam String phone) {
		String reg = "^09[0-9]{8}$";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(phone);
		if(matcher.matches()) {
			Userinf userinf = regesterJPASurviceImpl.findByPhone(phone);
			if(userinf != null) {
//			model.put("samePhone", "此號碼已被使用");
				return ResponseEntity.ok("samePhone");
			}else {
//			model.put("sucessPhone", "號碼可使用");
				return ResponseEntity.ok("sucessPhone");
			}
		}else {
			return ResponseEntity.ok("errorMatchPhone");
		}
	}
	
	@PostMapping("/RegesterUser")
	public String AddUser(ModelMap model, @RequestParam String account, @RequestParam String password,
			@RequestParam String passwordAG,@RequestParam Integer gender, 
			@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date birth, 
			@RequestParam String mail, @RequestParam String phone ) {
//		System.out.println("account");
		Userinf userinf = new Userinf();
		String regAccount = "^[A-Za-z0-9]{8,16}$";
//		Pattern patternAccount = Pattern.compile(regAccount);
//		Matcher matcherAccount = patternAccount.matcher(account);
//		if(matcherAccount.matches()==false) {
		if(!Pattern.matches(regAccount, account)) {
			model.put("sameAccount","請輸入 8-16 個字");
//			return "errorMatchPassword";
			return "regester";
		}else {
			Userinf userinfAccount = regesterJPASurviceImpl.findByPassword(password);
			if(userinfAccount != null) {
				model.put("sameAccount","此帳戶已被註冊");
//		 		return  "errorPassword";
				return "regester";
			}
		}
//		System.out.println("password");
		String regPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,16}$";
//		Pattern patternPassword = Pattern.compile(regPassword);
//		Matcher matcherPassword = patternPassword.matcher(password);
//		if(matcherPassword.matches()==false) {
		if(!Pattern.matches(regPassword, password)) {
			model.put("samePassword","至少有一個英文大寫、英文小寫及數字");
//			return "errorMatch";
			return "regester";
		}
//		}else {
//			Userinf userinfPassword = regesterJPASurviceImpl.findByPassword(password);
//			if(userinfPassword != null) {
//				model.put("samePassword","此密碼已被註冊");
////				return "errorPassword";	
//				return "regester";
//			}
//		}
		if(!password.equals(passwordAG)) {
			model.put("NonMatchPW", "與密碼不相符");
			return "regester";
		}
//		System.out.println("mail");
		String regMail = "^[0-9a-zA-Z]+@gmail\\.com$";
//		Pattern patternMail = Pattern.compile(regMail);
//		Matcher matcherMail = patternMail.matcher(mail);
//		if(matcherMail.matches()==false) {
		if(!Pattern.matches(regMail, mail)) {
			model.put("sameEmail","請輸入 Gmail");
//			return "errorMatchEmail";	
			return "regester";
		}else {
			Userinf userinfMail = regesterJPASurviceImpl.findByMail(mail);
			if(userinfMail != null) {
				model.put("sameEmail","此信箱已被註冊");
//				return "sameEmail";	
				return "regester";
			}			
		}
//		System.out.println("phone");
		String regPhone = "^09[0-9]{8}$";
//		Pattern patternPhoen = Pattern.compile(regPhone);
//		Matcher matcherPhone = patternPhoen.matcher(phone);
//		if(matcherPhone.matches()==false) {
		if(!Pattern.matches(regPhone, phone)) {
			model.put("samePhone","請輸入台灣手機格式");
//			return "errorMatchPhone";
			return "regester";
			
		}else {
			Userinf userinfPhone = regesterJPASurviceImpl.findByPhone(phone);
			if(userinfPhone != null) {
				model.put("samePhone","此號碼已被註冊");
				return "regester";
			}
		}
		
//		String BCryptPW = passwordEncoder.encode(password);
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String bcryptPW = bCryptPasswordEncoder.encode(password);
		userinf.setAccount(account);
		userinf.setPassword(bcryptPW);
		userinf.setGendar(gender);
		userinf.setBirth(birth);
		userinf.setMail(mail);
		userinf.setPhone(phone);
		userinf.setAddtime(new Date());
		userinf.setEdittime(new Date());
		jpaDao.save(userinf);
		
//		Cookie
		return "login";
	}
}
