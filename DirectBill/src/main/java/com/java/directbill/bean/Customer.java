package com.java.directbill.bean;

import com.google.gson.Gson;

public class Customer {

	private Integer cId;
	private String cName;
	private String cAdd;
	private String cAdd2;
	private String cMobile;
	private String cMobile2;
	private String emailId;
	private String birthDate;
	private Integer status = 1;
	private String createdDate;
	private String updatedDate;

	public Customer(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcAdd2() {
		return cAdd2;
	}

	public void setcAdd2(String cAdd2) {
		this.cAdd2 = cAdd2;
	}

	public String getcMobile2() {
		return cMobile2;
	}

	public void setcMobile2(String cMobile2) {
		this.cMobile2 = cMobile2;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAdd() {
		return cAdd;
	}

	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}

	public String getcMobile() {
		return cMobile;
	}

	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}

	public Integer getStatus() {
		return status;
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

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
