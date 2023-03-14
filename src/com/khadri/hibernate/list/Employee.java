package com.khadri.hibernate.list;

import java.util.List;

public class Employee {
	
	private int empId;
	private String empName;
	private List<String> teaching;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getTeaching() {
		return teaching;
	}
	public void setTeaching(List<String> teaching) {
		this.teaching = teaching;
	}
	
	

}
