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
import com.project.service.BarcodeService;

@Component
@Path("/Barcode")
public class BarcodeStudentRestController {
	
	@Autowired
	BarcodeService barcodeService;
	
	@POST
	@Path("searchStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String saveStudent(Barcode barcode) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Barcode> str = barcodeService.saveStudent(barcode);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@GET
	@Path("getAllData")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllStudent() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Barcode> str = barcodeService.getAllStudent();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@GET
	@Path("getDepartmentsList")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getDeptList() throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Barcode> str = barcodeService.getDeptList();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	
	
	
	
	@POST
	@Path("getListByJobTitle")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getListByJobTitlet(Barcode barcode) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List<Barcode> str = barcodeService.getListByJobTitle(barcode);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	
	@POST
	@Path("addNewStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addnewStudent(Barcode barcode) throws JsonGenerationException, JsonMappingException, IOException  {
		
		int str = barcodeService.addnewStudent(barcode);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson;
	}
	@POST
	@Path("deleteStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteStudent(Barcode barcode) throws JsonGenerationException, JsonMappingException, IOException  {
		
		int str = barcodeService.deleteStudent(barcode);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson; 
	}
	
	@POST
	@Path("getSelectedData")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getSelectedData(@FormParam("deptName") String deptName) throws JsonGenerationException, JsonMappingException, IOException  {
//		Barcode  barcode = new Barcode();
//		barcode.setDepartment(deptName);
		List<Barcode> str = barcodeService.getSelectedData(deptName);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson; 
	}
	
	@GET
	@Path("getRegionIdlist")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getRegionIdlist() throws JsonGenerationException, JsonMappingException, IOException  {

		List<Integer> str = barcodeService.getRegionIdlist();
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson; 
	}
//	getSalInfo
	@POST
	@Path("getSalInfo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getSalInfo(@FormParam("name") String name) throws JsonGenerationException, JsonMappingException, IOException  {
		
		List <String> salDetails = barcodeService.getSalInfo(name);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(salDetails);
		return studentJson; 
	}
	
	@POST
	@Path("editStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String editStudent(Barcode barcode) throws JsonGenerationException, JsonMappingException, IOException  {
		
		int msg = barcodeService.editStudent(barcode);
		ObjectMapper mapper = new ObjectMapper();
		String msg1 = mapper.writeValueAsString(msg);
		return msg1; 
	}
	
	
	@POST
	@Path("getDataDisplay")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getDataDisplay(@FormParam("name") String emptName) throws JsonGenerationException, JsonMappingException, IOException  {

		Barcode str = barcodeService.getDataDisplay(emptName);
		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writeValueAsString(str);
		return studentJson; 
	}
	
}







