package com.running.vegven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.running.vegven.dao.RegesterJPADao;
import com.running.vegven.model.Userinf;
@Service
public class RegesterJPASurviceImpl {
	@Autowired
	private RegesterJPADao regesterJPADao;
	@Autowired
	public RegesterJPASurviceImpl(RegesterJPADao regesterJPADao) {
		super();
		this.regesterJPADao = regesterJPADao;
	}
	public Userinf findByAccount(String account) {
		return regesterJPADao.findByAccount(account);
	}
	public Userinf findByPassword(String password) {
		return regesterJPADao.findByPassword(password);
	}
	public Userinf findByMail(String mail) {
		return regesterJPADao.findByMail(mail);
	}
	public Userinf findByPhone(String phone) {
		return regesterJPADao.findByPhone(phone);
	}
	
	
	
}
