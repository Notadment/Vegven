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
	private Integer productid;
	@Column(columnDefinition = "VARCHAR(20)")
	private String product;
	@Column(columnDefinition = "int unsigned default 0")
	private Integer amount;
	@Column(columnDefinition = "int unsigned default 0")
	private Integer price;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date shelvetime;
	@Column(columnDefinition = "VARCHAR(2000)")
	private String details;
	public Production(Integer productid, String product, Integer amount, Integer price, Date shelvetime,
			String details) {
		super();
		this.productid = productid;
		this.product = product;
		this.amount = amount;
		this.price = price;
		this.shelvetime = shelvetime;
		this.details = details;
	}
	@Override
	public String toString() {
		return "Production [productid=" + productid + ", product=" + product + ", amount=" + amount + ", price=" + price
				+ ", shelvetime=" + shelvetime + ", details=" + details + "]";
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getShelvetime() {
		return shelvetime;
	}
	public void setShelvetime(Date shelvetime) {
		this.shelvetime = shelvetime;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
