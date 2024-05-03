package com.running.vegven.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Production {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Productid;
	private String Product;
	private Integer Amount;
	private Integer Price;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date Shelvetime;
	private String Details;
	public Production(Integer productid, String product, Integer amount, Integer price, Date shelvetime,
			String details) {
		super();
		Productid = productid;
		Product = product;
		Amount = amount;
		Price = price;
		Shelvetime = shelvetime;
		Details = details;
	}
	public Integer getProductid() {
		return Productid;
	}
	public void setProductid(Integer productid) {
		Productid = productid;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	public Date getShelvetime() {
		return Shelvetime;
	}
	public void setShelvetime(Date shelvetime) {
		Shelvetime = shelvetime;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	
	
}
