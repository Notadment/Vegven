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
	private Integer historyid;
	private Integer buyUserid;
	private Integer productid;
	private Integer amount;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date historytime;
	public History(Integer historyid, Integer buyUserid, Integer productid, Integer amount, Date historytime) {
		super();
		this.historyid = historyid;
		this.buyUserid = buyUserid;
		this.productid = productid;
		this.amount = amount;
		this.historytime = historytime;
	}
	public Integer getHistoryid() {
		return historyid;
	}
	public void setHistoryid(Integer historyid) {
		this.historyid = historyid;
	}
	public Integer getBuyUserid() {
		return buyUserid;
	}
	public void setBuyUserid(Integer buyUserid) {
		this.buyUserid = buyUserid;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Date getHistorytime() {
		return historytime;
	}
	public void setHistorytime(Date historytime) {
		this.historytime = historytime;
	}
	@Override
	public String toString() {
		return "History [historyid=" + historyid + ", buyUserid=" + buyUserid + ", productid=" + productid + ", amount="
				+ amount + ", historytime=" + historytime + "]";
	}
	
	
	
	
}
