package com.running.vegven.service.impl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.running.vegven.dao.RegesterDao;
import com.running.vegven.model.Userinf;
import com.running.vegven.replyFormat.Result;
import com.running.vegven.service.RegesterService;

import jakarta.transaction.Transactional;
@Service
public class RegesterServiceImpl implements RegesterService{
	RegesterDao regesterDao;
	
	@Autowired
	public RegesterServiceImpl(RegesterDao regesterDao) {
		super();
		this.regesterDao = regesterDao;
	}
	
	@Override
	@Transactional
	public Result addUser(Userinf userinf) {
		userinf.setAddtime(new Date());
		userinf.setEdittime(new Date());
		Result res = regesterDao.addUserinf(userinf);
		return res;
	}

	@Override
	public Result getRegesterUser(Userinf userinf) {
		Result res = regesterDao.getRegesterUser(userinf);
		return res;
	}

	@Override
	@Transactional
	public Userinf selectAccount(String account) {
//		System.out.println(account);
		Userinf rs = regesterDao.selectAccount(account);
		
		return rs;
	}

	@Override
	@Transactional
	public Userinf selectPassword(String password) {
		Userinf rs = regesterDao.selectAccount(password);
		
		return rs;	
		}

	@Override
	public String selectEmail(Userinf googleMail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectPhone(Userinf phoneNum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
