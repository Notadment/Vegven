package com.running.vegven.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Userinf {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	@Column(columnDefinition = "VARCHAR(20) NOT NULL unique")
	private String account;
	@Column(columnDefinition = "VARCHAR(255) NOT NULL unique")
	private String password;
	@Column(columnDefinition = "tinyint unsigned default 0")
	private Integer gendar;
	@Column(columnDefinition = "VARCHAR(10) NOT NULL unique")
	private String phone;
	@Column(columnDefinition = "VARCHAR(150) NOT NULL unique")
	private String mail;
	
	@Column(columnDefinition = "int unsigned default 0")
	private Integer payamount=0;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date birth;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date addtime;
	@Column(columnDefinition = "DATETIME NOT NULL")
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

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getEdittime() {
		return edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public Userinf(Integer userid, String account, String password, Integer gendar, String phone, String mail,
			Integer payamount, Date birth, Date addtime, Date edittime) {
		super();
		this.userid = userid;
		this.account = account;
		this.password = password;
		this.gendar = gendar;
		this.phone = phone;
		this.mail = mail;
		this.payamount = payamount;
		this.birth = birth;
		this.addtime = addtime;
		this.edittime = edittime;
	}

	@Override
	public String toString() {
		return "Userinf [userid=" + userid + ", account=" + account + ", password=" + password + ", gendar=" + gendar
				+ ", phone=" + phone + ", mail=" + mail + ", payamount=" + payamount + ", birth=" + birth + ", addtime="
				+ addtime + ", edittime=" + edittime + "]";
	}
	
	
		
}
