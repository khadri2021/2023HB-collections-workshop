package com.khadri.hibernate.association.one2many.fk.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.khadri.hibernate.association.one2many.fk.entity.Employee1;
import com.khadri.hibernate.association.one2many.fk.entity.Projects;
import com.khadri.hibernate.session.BasicOperationSession;

public class Employee1Main {

	public static void main(String[] args) {

		Session session = BasicOperationSession.getSession();
		Transaction txn = session.beginTransaction();
		
		Set<Projects> projects=new HashSet<>();
		
		Employee1 employee1=new Employee1();
		employee1.setEmpName("Babjan");
		
		Projects project1=new Projects();
		project1.setProjectName("Spring Project");
		project1.setProjectDuration("6 Months");
		project1.setEmployee1(employee1);
		projects.add(project1);
		
		Projects project2=new Projects();
		project2.setProjectName("Spring Boot Project");
		project2.setProjectDuration("1 Year");
		project2.setEmployee1(employee1);
		projects.add(project2);
		
		Projects project3=new Projects();
		project3.setProjectName("RestFull Services Project");
		project3.setProjectDuration("1 Year");
		project3.setEmployee1(employee1);
		projects.add(project3);
		
		employee1.setProjects(projects);
		session.save(employee1);

		txn.commit();
		session.close();

	}
}
