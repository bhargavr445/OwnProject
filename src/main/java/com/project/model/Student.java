package com.project.model;

public class Student {
	
	private int stuId;
	private String stuName;
	private Address address;
	private String userName;
	private String password;
	
	public Student() {
		
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student(int stuId, String stuName, Address address, String userName, String password) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + ", userName=" + userName
				+ ", password=" + password + "]";
	}

	
	
	
}
