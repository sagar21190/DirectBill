package com.java.directbill.bo;

import com.google.gson.Gson;
import com.java.directbill.bean.Customer;

public class CustomerBo {

	public Integer save(Customer customerObj) {
		System.out.println(new Gson().toJson(customerObj));
		return 1;
	}
}
