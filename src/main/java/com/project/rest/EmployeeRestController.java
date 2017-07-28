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

import com.project.model.Employee;
import com.project.model.Department; 
import com.project.service.EmployeeService;

@Component
@Path("/Employee")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	@POST
	@Path("searchEmployeeById")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String saveStudent(Employee employee) throws JsonGenerationException, JsonMappingException, IOException  {

		List<Employee> str = employeeService.searchEmployee(employee);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@GET
	@Path("getAllId")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllIds() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Integer> str = employeeService.getAllIds();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@POST
	@Path("searchBylocation")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmpByLoc(@FormParam("location") String location) throws JsonGenerationException, JsonMappingException, IOException  {
		//Employee emp = new Employee();
		Department dept = new Department();
		dept.setLocation(location);
		//emp.seteName(location);
		Department str = employeeService.getEmpByLoc(dept);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
}







