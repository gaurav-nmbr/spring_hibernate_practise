package com.springcore.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("com/springcore/map1/hibconfig.xml").buildSessionFactory();
		
		Emp e1=new Emp();
		Emp e2= new Emp();
		
		e1.setEmpId(1);
		e1.setName("gaurav");
		
		e2.setEmpId(2);
		e2.setName("Babu");
		
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setProjectId(101);
		p1.setProjectName("java");
		
		p2.setProjectId(102);
		p2.setProjectName("Python");
		
		
		List<Emp> list1= new ArrayList<Emp>();
		List<Project> list2= new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);
		
		e1.setPro(list2);
		e2.setPro(list2);
		p2.setEmp(list1);
		p1.setEmp(list1);
		
		
		
		

		Session s= factory.openSession();
		s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
	
		
		
		
		
		
		
		s.getTransaction().commit();
		factory.close();

	}

}
