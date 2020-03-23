package com.java.directbill.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.directbill.bean.APIResponse;
import com.java.directbill.bean.Customer;
import com.java.directbill.bo.CustomerBo;

@Component
@Path("/customer")
public class CustomerService {

	@Autowired
	private CustomerBo objcustomerBo;

	// public CustomerBo getObjcustomerBo() {
	// return objcustomerBo;
	// }
	//
	// public void setObjcustomerBo(CustomerBo objcustomerBo) {
	// this.objcustomerBo = objcustomerBo;
	// }

	@GET
	@Path("/getCustomer/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomer(@PathParam("id") Integer id) {
		return Response.ok(new Customer(1, "sagar")).build();
	}

	@GET
	@Path("/getCustomerNew")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerNew(@QueryParam("id") Integer id) {
		return Response.ok(new Customer(1, "sagar")).build();
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(Customer customerObj) {
		System.out.println(objcustomerBo);
		Integer result = 0;// objcustomerBo.save(customerObj);
		int errorCode = (result == 1) ? 1 : 0;
		String errorMsg = (result == 1) ? "SUCCESS" : "FAILURE";
		return Response.ok(new APIResponse(errorCode, errorMsg)).build();
	}
}
