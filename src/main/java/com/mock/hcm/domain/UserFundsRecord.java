package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class UserFundsRecord {
	
	private Integer id;
	private Integer userId;
	private String action;
	private String extAction;
	private String orderNo;
	private Integer type;
	private Double amount;
	private Date createTime;
	
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
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getExtAction() {
		return extAction;
	}
	public void setExtAction(String extAction) {
		this.extAction = extAction;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
