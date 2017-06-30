package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class TenantApplyRecord {
	
	private Integer id;
	private Integer userId;
	private String realName;
	private String idCardNo;
	private String idCardImages;
	private Date applyTime;
	private Date handleTime;
	private Integer applyResult;
	private String proprietorPhone;
	
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getIdCardImages() {
		return idCardImages;
	}
	public void setIdCardImages(String idCardImages) {
		this.idCardImages = idCardImages;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getHandleTime() {
		return handleTime;
	}
	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}
	public Integer getApplyResult() {
		return applyResult;
	}
	public void setApplyResult(Integer applyResult) {
		this.applyResult = applyResult;
	}
	public String getProprietorPhone() {
		return proprietorPhone;
	}
	public void setProprietorPhone(String proprietorPhone) {
		this.proprietorPhone = proprietorPhone;
	}
}
