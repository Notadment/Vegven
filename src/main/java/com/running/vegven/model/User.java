package com.running.vegven.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Userid;
	private String Account;
	private String Password;
	private Integer Gendar;
	private String Phone;
	private String Mail;
	private Integer Payamount;
	private Date Birth;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date Addtime;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date Edittime;
	public User(Integer userid, String account, String password, Integer gendar, String phone, String mail,
			Integer payamount, Date birth, Date addtime, Date edittime) {
		super();
		Userid = userid;
		Account = account;
		Password = password;
		Gendar = gendar;
		Phone = phone;
		Mail = mail;
		Payamount = payamount;
		Birth = birth;
		Addtime = addtime;
		Edittime = edittime;
	}
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		Userid = userid;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getGendar() {
		return Gendar;
	}
	public void setGendar(Integer gendar) {
		Gendar = gendar;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public Integer getPayamount() {
		return Payamount;
	}
	public void setPayamount(Integer payamount) {
		Payamount = payamount;
	}
	public Date getBirth() {
		return Birth;
	}
	public void setBirth(Date birth) {
		Birth = birth;
	}
	public Date getAddtime() {
		return Addtime;
	}
	public void setAddtime(Date addtime) {
		Addtime = addtime;
	}
	public Date getEdittime() {
		return Edittime;
	}
	public void setEdittime(Date edittime) {
		Edittime = edittime;
	}
	
		
}
