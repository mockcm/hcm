package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class MallCouponRecord {
	
	private Integer id;
	private Integer userId;
	private Integer scoreCouponId;
	private Integer status;
	private Date createTime;
	private Date usedTime;
	
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
	public Integer getScoreCouponId() {
		return scoreCouponId;
	}
	public void setScoreCouponId(Integer scoreCouponId) {
		this.scoreCouponId = scoreCouponId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUsedTime() {
		return usedTime;
	}
	public void setUsedTime(Date usedTime) {
		this.usedTime = usedTime;
	}
}
