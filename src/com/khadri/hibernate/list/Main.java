package com.khadri.hibernate.list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		List<String> list=new ArrayList();
		list.add("physics");
		list.add("java");
		list.add("spring");
		list.add("hibernate");
		
		
		Employee employee1=new Employee();
		employee1.setEmpName("VIKRAM");
		employee1.setTeaching(list);
		
		session.save(employee1);
		txn.commit();
		session.close();
		factory.close();

	}

}
