package com.khadri.hibernate.association.one2many.fk.entity;

import java.util.Set;

public class Employee1 {

	private String empId;
	private String empName;
	private Set<Projects> projects;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Set<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}

}