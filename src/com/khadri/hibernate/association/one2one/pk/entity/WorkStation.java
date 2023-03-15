package com.khadri.hibernate.association.one2one.pk.entity;

public class WorkStation {

	private String workStationId;
	private String workStationFloor;
	private String workStationblock;
	private Employee employee;

	public String getWorkStationId() {
		return workStationId;
	}

	public void setWorkStationId(String workStationId) {
		this.workStationId = workStationId;
	}

	public String getWorkStationFloor() {
		return workStationFloor;
	}

	public void setWorkStationFloor(String workStationFloor) {
		this.workStationFloor = workStationFloor;
	}

	public String getWorkStationblock() {
		return workStationblock;
	}

	public void setWorkStationblock(String workStationblock) {
		this.workStationblock = workStationblock;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
