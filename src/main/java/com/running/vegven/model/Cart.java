package com.running.vegven.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Cartid;
	private Integer Userid;
	private Integer Productsid;
	private Integer Cartamount;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date Carttime;
	public Cart(Integer cartid, Integer userid, Integer productsid, Integer cartamount, Date carttime) {
		super();
		Cartid = cartid;
		Userid = userid;
		Productsid = productsid;
		Cartamount = cartamount;
		Carttime = carttime;
	}
	public Integer getCartid() {
		return Cartid;
	}
	public void setCartid(Integer cartid) {
		Cartid = cartid;
	}
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		Userid = userid;
	}
	public Integer getProductsid() {
		return Productsid;
	}
	public void setProductsid(Integer productsid) {
		Productsid = productsid;
	}
	public Integer getCartamount() {
		return Cartamount;
	}
	public void setCartamount(Integer cartamount) {
		Cartamount = cartamount;
	}
	public Date getCarttime() {
		return Carttime;
	}
	public void setCarttime(Date carttime) {
		Carttime = carttime;
	}
	
	
	
}
