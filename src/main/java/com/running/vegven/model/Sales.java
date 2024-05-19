package com.running.vegven.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer saleid;
	private Integer saleproductid;
	private Integer discount;
	@Column(columnDefinition = "int unsigned default 0")
	private Integer saleamount;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date starttime;
	public Sales(Integer saleid, Integer saleproductid, Integer discount, Integer saleamount, Date starttime) {
		super();
		this.saleid = saleid;
		this.saleproductid = saleproductid;
		this.discount = discount;
		this.saleamount = saleamount;
		this.starttime = starttime;
	}
	public Integer getSaleid() {
		return saleid;
	}
	public void setSaleid(Integer saleid) {
		this.saleid = saleid;
	}
	public Integer getSaleproductid() {
		return saleproductid;
	}
	public void setSaleproductid(Integer saleproductid) {
		this.saleproductid = saleproductid;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getSaleamount() {
		return saleamount;
	}
	public void setSaleamount(Integer saleamount) {
		this.saleamount = saleamount;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	@Override
	public String toString() {
		return "Sales [saleid=" + saleid + ", saleproductid=" + saleproductid + ", discount=" + discount
				+ ", saleamount=" + saleamount + ", starttime=" + starttime + "]";
	}
	
	
	
	
	
	
}
