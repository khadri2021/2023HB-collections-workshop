package com.khadri.hibernate.association.one2one.pk.entity;

public class Employee {

	private String empId;
	private String empName;
	private WorkStation workStation;

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

	public WorkStation getWorkStation() {
		return workStation;
	}

	public void setWorkStation(WorkStation workStation) {
		this.workStation = workStation;
	}
}