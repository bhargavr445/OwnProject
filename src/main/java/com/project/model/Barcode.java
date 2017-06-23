package com.project.model;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Barcode {
	private String name;
	private String jobTitle;
	private String department;
	private String annualSalary;
	private String estimatedAnnualSalary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(String annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String getEstimatedAnnualSalary() {
		return estimatedAnnualSalary;
	}
	public void setEstimatedAnnualSalary(String estimatedAnnualSalary) {
		this.estimatedAnnualSalary = estimatedAnnualSalary;
	}
	
	
	
	
	
	
}
