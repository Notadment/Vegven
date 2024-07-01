package com.running.vegven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.running.vegven.model.Userinf;
// 使用JPA執行去查詢是否存在資料
public interface RegesterJPADao extends JpaRepository<Userinf, Integer> {
	Userinf findByAccount(String account);
	Userinf findByPassword(String password);
	Userinf findByMail(String mail);
	Userinf findByPhone(String phone);
}
