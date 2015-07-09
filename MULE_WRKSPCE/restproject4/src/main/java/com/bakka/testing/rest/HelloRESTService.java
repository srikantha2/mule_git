package com.bakka.testing.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class HelloRESTService {

	@GET
	@Path("hello/{name}")
	public String sayMorning(@PathParam("name") String name){
		return "Hello Mr."+name+" , Good Morning!!!";
	}
	
}
