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
	private Integer SaleId;
	private Integer SaleProductId;
	private Integer Discount;
	private Integer SaleAmount;
	@Column(columnDefinition = "DATETIME NOT NULL")
	private Date StartTime;
	public Sales(Integer saleId, Integer saleProductId, Integer discount, Integer saleAmount, Date startTime) {
		super();
		SaleId = saleId;
		SaleProductId = saleProductId;
		Discount = discount;
		SaleAmount = saleAmount;
		StartTime = startTime;
	}
	public Integer getSaleId() {
		return SaleId;
	}
	public void setSaleId(Integer saleId) {
		SaleId = saleId;
	}
	public Integer getSaleProductId() {
		return SaleProductId;
	}
	public void setSaleProductId(Integer saleProductId) {
		SaleProductId = saleProductId;
	}
	public Integer getDiscount() {
		return Discount;
	}
	public void setDiscount(Integer discount) {
		Discount = discount;
	}
	public Integer getSaleAmount() {
		return SaleAmount;
	}
	public void setSaleAmount(Integer saleAmount) {
		SaleAmount = saleAmount;
	}
	public Date getStartTime() {
		return StartTime;
	}
	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}
	
	
	
}
