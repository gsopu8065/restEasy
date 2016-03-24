package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JSONService {

	@GET
	@Path("/getProduct")
	@Produces("application/json")
	public Product getProductInJSON() {

		Product product = new Product();
		product.setName("iPad 3 with resteasy");
		product.setQty(999);
		
		return product; 

	}

	@POST
	@Path("/submitProduct")
	@Consumes("application/json")
	public String createProductInJSON(Product product) {

		String result = "REST EASY Product created : " + product.getName();
		//return Response.status(201).entity(result).build();
		return result;
		
	}
	
}