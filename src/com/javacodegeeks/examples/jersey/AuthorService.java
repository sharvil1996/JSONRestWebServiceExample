package com.javacodegeeks.examples.jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javacodegeeks.examples.bean.CityBean;
import com.javacodegeeks.examples.dao.CityDAO;


@Path("/City")
public class AuthorService {
	@GET
	@Path("/cityList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CityBean> getTrackInJSON() {
		return new CityDAO().list();
	}
	
	
	

}
