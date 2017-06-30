package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class ProprietorApplyRecord {
	
	private Integer id;
	private String residentialArea;
	private String phone;
	private String realName;
	private String building;
	private String roomNo;
	private Integer applyResult;
	private Date applyTime;
	private Date handleTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResidentialArea() {
		return residentialArea;
	}
	public void setResidentialArea(String residentialArea) {
		this.residentialArea = residentialArea;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
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
}
