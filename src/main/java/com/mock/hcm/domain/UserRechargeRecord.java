package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class UserRechargeRecord {
	
	private Integer id;
	private Integer userId;
	private Double amount;
	private Double prevBalance;
	private Double postBalance;
	private Integer rechargeType;
	private Integer status;
	private Date rechargeTime;
	private Double freezeAmount;
	private String orderNo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(Double prevBalance) {
		this.prevBalance = prevBalance;
	}
	public Double getPostBalance() {
		return postBalance;
	}
	public void setPostBalance(Double postBalance) {
		this.postBalance = postBalance;
	}
	public Integer getRechargeType() {
		return rechargeType;
	}
	public void setRechargeType(Integer rechargeType) {
		this.rechargeType = rechargeType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getRechargeTime() {
		return rechargeTime;
	}
	public void setRechargeTime(Date rechargeTime) {
		this.rechargeTime = rechargeTime;
	}
	public Double getFreezeAmount() {
		return freezeAmount;
	}
	public void setFreezeAmount(Double freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
}
