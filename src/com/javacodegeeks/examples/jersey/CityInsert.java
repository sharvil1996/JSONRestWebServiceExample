package com.javacodegeeks.examples.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/city")
public class CityInsert {
	
	@GET
	@Path("/cityList")
	@Produces(MediaType.APPLICATION_XML)
	public String[] getMes(){
		String arr[] = new String[2];
		arr[0] = "Hi";
		arr[1] = "Hello";
		return arr;
	}
	
	@GET
	public String getMesss(){
		return "Hi";
	}
}
