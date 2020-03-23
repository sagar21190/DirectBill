package com.java.directbill.bean;

import com.google.gson.Gson;

public class APIResponse {
	private Integer errorCode;
	private String errorMsg;

	public APIResponse(Integer errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
