package com.java.directbill.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;

@Service
@Path("/testService")
public class TestService {

	@GET
	@Path("/testMsg")
	public String testMsg() {
		return "Hello World !! - Jersey 2";
	}
}
