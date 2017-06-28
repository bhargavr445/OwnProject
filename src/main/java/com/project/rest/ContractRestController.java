package com.project.rest;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.Barcode;
import com.project.model.Contract;
import com.project.service.ContractService;

@Component
@Path("/Contract")
public class ContractRestController {
	
	@Autowired
	ContractService contractService;
	
	
	@GET
	@Path("getEmpByName")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllStudent() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Contract> str = contractService.getEmpByName();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
}







