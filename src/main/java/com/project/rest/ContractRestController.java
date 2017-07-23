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
	public String searchByJobTitle(@FormParam("department") String department) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Contract> str = contractService.searchByJobTitle(department);
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

	
	@POST
	@Path("getStudentInImage")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudentInImage(Contract contract) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Contract> imageResults = contractService.getStudentInImage(contract);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(imageResults);
		return studentJson;
	}
	
	@GET
	@Path("getjobTitle")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getjobTitle() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<String> str = contractService.getjobTitle();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	
	
	@POST
	@Path("searchByNameString")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String searchByNameString(@FormParam("name") String name) throws JsonGenerationException, JsonMappingException, IOException  {
		Contract contract = new Contract();
		contract.setName(name);
		String myName = contract.getName();
		List<Contract> str = contractService.searchByNameString(contract);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	
	@POST
	@Path("deleteContract")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String deletecontract(Contract contract) throws JsonGenerationException, JsonMappingException, IOException  {
		int str = contractService.deletecontract(contract);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
//	
//	@POST
//	@Path("searchByNameString")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public String searchByNameString(Contract contract) throws JsonGenerationException, JsonMappingException, IOException  {
//		
//		List<Contract> str = contractService.searchByNameString(contract);
//		ObjectMapper mapper = new ObjectMapper();
//		String studentJson = mapper.writeValueAsString(str);
//		return studentJson;
//	}
}







