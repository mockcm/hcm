package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class AgentApplyRecord {
	
	private Integer id;
	private Integer userId;
	private String realName;
	private String idCardNo;
	private Integer workedYears;
	private String certificate;
	private String certificateNo;
	private String certificateImages;
	private Integer applyResult;
	private Date applyTime;
	private Date handleTime;
	private Integer handlerId;
	private Double payAmount;
	
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
	public Integer getWorkedYears() {
		return workedYears;
	}
	public void setWorkedYears(Integer workedYears) {
		this.workedYears = workedYears;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getCertificateNo() {
		return certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}
	public String getCertificateImages() {
		return certificateImages;
	}
	public void setCertificateImages(String certificateImages) {
		this.certificateImages = certificateImages;
	}
	public Integer getApplyResult() {
		return applyResult;
	}
	public void setApplyResult(Integer applyResult) {
		this.applyResult = applyResult;
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
	public Integer getHandlerId() {
		return handlerId;
	}
	public void setHandlerId(Integer handlerId) {
		this.handlerId = handlerId;
	}
	public Double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}
}
