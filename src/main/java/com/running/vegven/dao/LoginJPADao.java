package com.running.vegven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.running.vegven.model.Userinf;

public interface LoginJPADao extends JpaRepository<Userinf, Integer>{
	
	Userinf findByAccount(String account);
	Userinf findByPassword(String password);
	Userinf findByTokenSet(String token);
}
