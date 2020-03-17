package com.java.directbill.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import com.java.directbill.bean.Customer;

@Singleton
@Path("/customer")
public class CustomerService {

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
}
