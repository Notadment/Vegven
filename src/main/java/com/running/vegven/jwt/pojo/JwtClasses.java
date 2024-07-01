package com.running.vegven.jwt.pojo;

import java.util.Date;
// 欲放入JWT的物件
public class JwtClasses {
	private Integer userid;
	private String account;
	private String password;
	private Integer gendar;
	private String phone;
	private String mail;
	private Integer payamount;
	private Date edittime;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getGendar() {
		return gendar;
	}
	public void setGendar(Integer gendar) {
		this.gendar = gendar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getPayamount() {
		return payamount;
	}
	public void setPayamount(Integer payamount) {
		this.payamount = payamount;
	}
	public Date getEdittime() {
		return edittime;
	}
	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}
	public JwtClasses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtClasses(Integer userid, 
			String account, String password, 
			Integer gendar, String phone, 
			String mail, Integer payamount, 
			Date edittime) {
		super();
		this.userid = userid;
		this.account = account;
		this.password = password;
		this.gendar = gendar;
		this.phone = phone;
		this.mail = mail;
		this.payamount = payamount;
		this.edittime = edittime;
	}
	
}
