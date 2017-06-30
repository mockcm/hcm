package com.mock.hcm.common;

public class JsonResult {
	
	private String status;
	private String message;
	private Object data;
	
	public String getStatus() {
		return status;
	}
	public JsonResult status(String status) {
		this.status = status;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public JsonResult show(String message) {
		this.message = message;
		return this;
	}
	
	public Object getData() {
		return data;
	}
	public JsonResult data(Object data) {
		this.data = data;
		return this;
	}
	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
}
