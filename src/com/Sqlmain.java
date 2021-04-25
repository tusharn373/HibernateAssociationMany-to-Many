package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Sqlmain {

	public static void main(String[] args) {
	     Configuration config=new AnnotationConfiguration();
	     config.configure("hibernate.cfg.xml");
	     SessionFactory ses=config.buildSessionFactory();
	     Session s1=ses.openSession();
	     Session s2=ses.openSession();
	     List<Employee> l1=new ArrayList<Employee>();
		 List<Employee> l2=new ArrayList<Employee>();
		 Employee e1=new Employee(4566, "Ram","Pune",56000);
		 Employee e2=new Employee(4567, "Raj","Mubai",66000);
	   	 Employee e3=new Employee(4568, "Radha","Nashik",86000);
		 Employee e4=new Employee(4569, "Rama","Pune",56000);
		 Employee e5=new Employee(4570, "Sanket","Mumbai",16000);
	   	 Employee e6=new Employee(4571, "Purva","Abad",96000);
		 Employee e7=new Employee(4572, "Avani","Pune",66000);
			l1.add(e1);l1.add(e3);l1.add(e4);l1.add(e5);l1.add(e6);
			l2.add(e2);l2.add(e3);l2.add(e7);l2.add(e4);l2.add(e1);
			project p1=new project(10002, "ABCD",4.5f,l1);
			project p2=new project(14478, "ZYCS",7.8f,l2);
			s1.save(p1);
			Transaction tx=s1.beginTransaction();
			tx.commit();
			s2.save(p2);
			
	Transaction tx1=s2.beginTransaction();
			tx1.commit();
			



	}

}
