package com.mock.hcm.domain;

import java.util.Date;

import com.mock.simplemvc.annotation.Table;

@Table
public class PropertyNotice {
	
	private Integer id;
	private String title;
	private String images;
	private String content;
	private Integer status;
	private Date createTime;
	private Date pubishTime;
	private Date publisherId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Date getPubishTime() {
		return pubishTime;
	}
	public void setPubishTime(Date pubishTime) {
		this.pubishTime = pubishTime;
	}
	public Date getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Date publisherId) {
		this.publisherId = publisherId;
	}
}
