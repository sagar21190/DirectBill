package com.java.directbill.bean;

import com.google.gson.Gson;

public class Customer extends UserDetails {

	private Integer cId;
	private String userId;
	private String sessionId;
	private String loginAttempt;
	private String isLock;
	private String isActive;
	private String createdDate;
	private String updatedDate;
	
	public Customer() {
		super();
	}

	public Customer(int cId, String fName) {
		super();
		this.cId = cId;
		this.fName = fName;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getIsLock() {
		return isLock;
	}

	public void setIsLock(String isLock) {
		this.isLock = isLock;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getLoginAttempt() {
		return loginAttempt;
	}

	public void setLoginAttempt(String loginAttempt) {
		this.loginAttempt = loginAttempt;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
