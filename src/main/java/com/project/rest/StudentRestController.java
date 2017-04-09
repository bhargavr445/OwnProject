package com.project.rest;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.Student;
import com.project.service.StudentService;

@Component
@Path("/Student")
public class StudentRestController {
	
	@Autowired
	StudentService studentService;
	
	@POST
	@Path("saveStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String saveStudent(Student  student) throws JsonGenerationException, JsonMappingException, IOException  {
		
		Student str = studentService.saveStudent(student);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String login(Student  student) throws JsonGenerationException, JsonMappingException, IOException  {
		
		//Student str = studentService.saveStudent(student);
		
		ObjectMapper mapper = new ObjectMapper();
		
		if(student.getUserName().equalsIgnoreCase("bhargav") && student.getPassword().equalsIgnoreCase("password123")){
			String studentJson = mapper.writeValueAsString(student);
			return studentJson;
		}else{
			String studentJson = mapper.writeValueAsString(new Student());
			return studentJson;
		}		
		
	}
	
	@POST
	@Path("searchData")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String search(Student  student) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Student> str = studentService.search(student);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
		
		
	}
	
	@GET
	@Path("loadStudentData")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String load() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Student> str = studentService.loadData();
		
		ObjectMapper mapper = new ObjectMapper();
		
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
		
		
	}
	
	
}
