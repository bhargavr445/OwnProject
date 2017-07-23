package com.project.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
	
	private int empNo;
	
	private String eName;
	
	private String job;
	
	private int mgr;

	private int sal;
	
	private int comission;
	
	private int detpNo;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComission() {
		return comission;
	}

	public void setComission(int comission) {
		this.comission = comission;
	}

	public int getDetpNo() {
		return detpNo;
	}

	public void setDetpNo(int detpNo) {
		this.detpNo = detpNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal
				+ ", comission=" + comission + ", detpNo=" + detpNo + "]";
	}
	
	
	
	
	
}
