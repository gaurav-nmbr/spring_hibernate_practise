package com.springcore.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/springcore/map/hibconfig.xml").buildSessionFactory();
		
		
		
		Session s = factory.openSession();

		
		Question q =(Question)s.get(Question.class, 214);
		
		System.out.println(q.getQuestion());
		
		for(Answer a:q.getAns()){
			System.out.println(a.getAnswer());
		}
	}
	
}
