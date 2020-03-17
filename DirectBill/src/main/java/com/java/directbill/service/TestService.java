package com.java.directbill.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
@Path("/testService")
public class TestService {

	@GET
	@Path("/testMsg")
	public String testMsg() {
		return "Hello World !! - Jersey 2";
	}
}
