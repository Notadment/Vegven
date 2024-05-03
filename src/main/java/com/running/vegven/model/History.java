package com.running.vegven.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class History {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Historyid;
	private Integer BuyUserid;
	private Integer Productid;
	private Integer Amount;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date Historytime;
	public History(Integer historyid, Integer buyUserid, Integer productid, Integer amount, Date historytime) {
		super();
		Historyid = historyid;
		BuyUserid = buyUserid;
		Productid = productid;
		Amount = amount;
		Historytime = historytime;
	}
	public Integer getHistoryid() {
		return Historyid;
	}
	public void setHistoryid(Integer historyid) {
		Historyid = historyid;
	}
	public Integer getBuyUserid() {
		return BuyUserid;
	}
	public void setBuyUserid(Integer buyUserid) {
		BuyUserid = buyUserid;
	}
	public Integer getProductid() {
		return Productid;
	}
	public void setProductid(Integer productid) {
		Productid = productid;
	}
	public Integer getAmount() {
		return Amount;
	}
	public void setAmount(Integer amount) {
		Amount = amount;
	}
	public Date getHistorytime() {
		return Historytime;
	}
	public void setHistorytime(Date historytime) {
		Historytime = historytime;
	}
	
	
}
