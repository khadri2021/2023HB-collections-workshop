package com.khadri.hibernate.association.one2many.fk.entity;

public class Projects {

	private String uuid;
	private String projectName;
	private String projectDuration;
	private Employee1 employee1;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDuration() {
		return projectDuration;
	}

	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}

	public Employee1 getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}
}
