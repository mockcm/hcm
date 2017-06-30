package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class UserWithdrawRecord {
	
	private Integer id;
	private Integer userId;
	private Double freezeAmount;
	private Double amount;
	private Double prevBalance;
	private Double postBalance;
	private Integer status;
	private Date submitTime;
	private Date handleTime;
	private String orderNo;
	private String remark;
	
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
	public Double getFreezeAmount() {
		return freezeAmount;
	}
	public void setFreezeAmount(Double freezeAmount) {
		this.freezeAmount = freezeAmount;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public Date getHandleTime() {
		return handleTime;
	}
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
