package com.project.model;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import com.project.model.Address;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contract {
	private String name;
	private String jobTitle;
	private String department;
	private String annualSalary;
	private String estimatedAnnualSalary;
	private Address address;
	private float tax;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	
	
}
