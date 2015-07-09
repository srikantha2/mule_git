package com.bakka.testing.rest.object;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestWithJsonOrXml {

	@GET
	@Path("json/customer1")
	
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerInfoJson(){
		return new Customer();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("xml/customer1")
	public Customer getCustomerInfoXml() {
		return new Customer();
	}
	
	
}
