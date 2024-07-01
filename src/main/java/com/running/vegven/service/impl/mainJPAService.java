package com.running.vegven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.running.vegven.dao.MainJPADao;
import com.running.vegven.model.Production;

@Service
public class mainJPAService {
	@Autowired
	private MainJPADao mainJPADao;
	
	public List<Production> getAllProductions() {
		return mainJPADao.findAll();
	}
}
