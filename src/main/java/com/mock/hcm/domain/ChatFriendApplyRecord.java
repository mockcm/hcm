package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;
@Table
public class ChatFriendApplyRecord {
	
	private Integer id;
	private Integer inviterId;
	private Integer handlerId;
	private String remark;
	private Date applyTime;
	private Integer applyResult;
	private Date handleTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInviterId() {
		return inviterId;
	}
	public void setInviterId(Integer inviterId) {
		this.inviterId = inviterId;
	}
	public Integer getHandlerId() {
		return handlerId;
	}
	public void setHandlerId(Integer handlerId) {
		this.handlerId = handlerId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Integer getApplyResult() {
		return applyResult;
	}
	public void setApplyResult(Integer applyResult) {
		this.applyResult = applyResult;
	}
	public Date getHandleTime() {
		return handleTime;
	}
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
}
