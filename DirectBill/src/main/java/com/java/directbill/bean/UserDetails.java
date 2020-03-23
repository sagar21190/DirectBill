package com.java.directbill.bean;

import com.google.gson.Gson;

public class UserDetails {
	private String userId;
	private String userName;
	private String pwd;
	protected String fName;
	private String mName;
	private String lName;
	private String cAdd1;
	private String cAdd2;
	private String pincode;
	private String talId;
	private String distId;
	private String stateId;
	private String cMobile1;
	private String cMobile2;
	private String emailId;
	private String birthDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getcAdd1() {
		return cAdd1;
	}

	public void setcAdd1(String cAdd1) {
		this.cAdd1 = cAdd1;
	}

	public String getcAdd2() {
		return cAdd2;
	}

	public void setcAdd2(String cAdd2) {
		this.cAdd2 = cAdd2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getTalId() {
		return talId;
	}

	public void setTalId(String talId) {
		this.talId = talId;
	}

	public String getDistId() {
		return distId;
	}

	public void setDistId(String distId) {
		this.distId = distId;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getcMobile1() {
		return cMobile1;
	}

	public void setcMobile1(String cMobile1) {
		this.cMobile1 = cMobile1;
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

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}
