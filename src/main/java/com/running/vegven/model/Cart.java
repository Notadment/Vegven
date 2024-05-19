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
	private Integer cartid;
	private Integer userid;
	private Integer productsid;
	private Integer cartamount;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date carttime;
	public Cart(Integer cartid, Integer userid, Integer productsid, Integer cartamount, Date carttime) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.productsid = productsid;
		this.cartamount = cartamount;
		this.carttime = carttime;
	}
	public Integer getCartid() {
		return cartid;
	}
	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getProductsid() {
		return productsid;
	}
	public void setProductsid(Integer productsid) {
		this.productsid = productsid;
	}
	public Integer getCartamount() {
		return cartamount;
	}
	public void setCartamount(Integer cartamount) {
		this.cartamount = cartamount;
	}
	public Date getCarttime() {
		return carttime;
	}
	public void setCarttime(Date carttime) {
		this.carttime = carttime;
	}
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", userid=" + userid + ", productsid=" + productsid + ", cartamount="
				+ cartamount + ", carttime=" + carttime + "]";
	}
	
	
	
	
	
}
