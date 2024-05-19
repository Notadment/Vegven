package com.running.vegven.dao;

import com.running.vegven.model.Userinf;
import com.running.vegven.replyFormat.Result;
import java.util.List;


public interface RegesterDao {
	Result addUserinf(Userinf account);
	Result getRegesterUser(Userinf UserId);
	Userinf selectAccount(String account);
	Userinf selectPassword(String password);
	Userinf selectEmail(Userinf googleMail);
	Userinf selectPhone(Userinf phoneNum);
}
