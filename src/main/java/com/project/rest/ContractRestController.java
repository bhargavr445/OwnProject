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
	
	
	@POST
	@Path("getEmpByName")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllStudent(Contract contract) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Contract> str = contractService.getEmpByName(contract);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@GET
	@Path("getDeptList")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getDeptList() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<String> str = contractService.getDeptList();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@POST
	@Path("searchByJobTitle")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String searchByJobTitle(Contract contract) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Contract> str = contractService.searchByJobTitle(contract);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@POST
	@Path("editContractStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int editContractStudent(Contract contract) throws JsonGenerationException, JsonMappingException, IOException  {
		
		int str = contractService.editContractStudent(contract);
		//ObjectMapper mapper = new ObjectMapper();
		//String studentJson = mapper.writeValueAsString(str);
		return str;
	}
}







