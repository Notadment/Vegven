package com.running.vegven.service.impl;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.running.vegven.dao.LoginJPADao;
import com.running.vegven.model.Userinf;

import ch.qos.logback.core.encoder.Encoder;

@Service
public class LoginSurvice {
	@Autowired
	private LoginJPADao loginJPADao;
	@Autowired
	public LoginSurvice(LoginJPADao loginJPADao) {
		super();
		this.loginJPADao = loginJPADao;
	}
	public Userinf findByAccount(String account) {
		return loginJPADao.findByAccount(account);
	}
	public Userinf findByPassword(String password) {
		return loginJPADao.findByPassword(password);
	}
	
//  使用BCryptPasswordEncoder 加密登入並驗證
//	private boolean validPassword(String inputPw, String storePw, Userinf user) {
//		BCryptPasswordEncoder encoderPw = new BCryptPasswordEncoder();
//		if(storePw.startsWith("$2a$")) {
//			return encoderPw.matches(inputPw, storePw);
//		}
//		if(inputPw.equals(storePw)) {
//			String newCryptPw = encoderPw.encode(inputPw);
//			user.setPassword(newCryptPw);
//			loginJPADao.save(user);
//			return true;
//		}else {
//			return false;
//		}
//			
//	}
//	
//	// token時效設定為一天
//	public boolean tokensTime(String token,String changePw) {
//		Userinf userinf = loginJPADao.findByTokenSet(token);
//		if(userinf ==null || userinf.getTokenTime()==null) {
//			return false;
//		}
//		long tokenTime = new Date().getTime() - userinf.getTokenTime().getTime();
//		long tokenTimeSetHour = TimeUnit.MILLISECONDS.toHours(tokenTime);
//		return tokenTimeSetHour<24;
//	}
	
	// 存token
//	public Userinf saveToken(String account,String token) {
//		Userinf userinf = loginJPADao.findByTokenSet(token);
//	}
}
