package com.running.vegven.service;


import com.running.vegven.model.Userinf;
import com.running.vegven.replyFormat.Result;

public interface RegesterService {
	Result addUser(Userinf userinf);
	Result getRegesterUser(Userinf UserId);
	Userinf selectAccount(String account);
	Userinf selectPassword(String password);
	Userinf selectEmail(String email);
	Userinf selectPhone(String phone);
}
