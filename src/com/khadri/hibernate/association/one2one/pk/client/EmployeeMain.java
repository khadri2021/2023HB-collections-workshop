package com.khadri.hibernate.association.one2one.pk.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.association.one2one.pk.entity.Employee;
import com.khadri.hibernate.association.one2one.pk.entity.WorkStation;
import com.khadri.hibernate.session.BasicOperationSession;

public class EmployeeMain {

	public static void main(String[] args) {

		Session session = BasicOperationSession.getSession();
		Transaction txn = session.beginTransaction();

		Employee employee1 = new Employee();
		employee1.setEmpName("Babjan");
		
		WorkStation workStation1 = new WorkStation();
		workStation1.setWorkStationFloor("3rd Floor");
		workStation1.setWorkStationblock("Develop");
		workStation1.setEmployee(employee1);
		
		employee1.setWorkStation(workStation1);

		session.save(employee1);

		txn.commit();
		session.close();

	}
}
