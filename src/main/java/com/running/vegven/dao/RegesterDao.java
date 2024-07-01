package com.running.vegven.dao;

import com.running.vegven.model.Userinf;
import com.running.vegven.replyFormat.Result;


public interface RegesterDao {
	Result addUserinf(Userinf account);
	Result getRegesterUser(Userinf UserId);
	Userinf selectAccount(String account);
	Userinf selectPassword(String password);
	Userinf selectEmail(String email);
	Userinf selectPhone(String phone);
}
