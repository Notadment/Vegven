package com.running.vegven.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.running.vegven.dao.LoginJPADao;
import com.running.vegven.model.Userinf;

@Service
public class LoginJPASurvice {
	@Autowired
	private LoginJPADao loginJPADao;
	@Autowired
	public LoginJPASurvice(LoginJPADao loginJPADao) {
		super();
		this.loginJPADao = loginJPADao;
	}
	public Userinf findByAccount(String account) {
		return loginJPADao.findByAccount(account);
	}
	public Userinf findByPassword(String password) {
		return loginJPADao.findByPassword(password);
	}
	public Userinf findByTokenSet(String token) {
		return loginJPADao.findByTokenSet(token);
	}	
}
