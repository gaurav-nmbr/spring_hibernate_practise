package com.springcore.map;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("com/springcore/map/hibconfig.xml").buildSessionFactory();
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/map/coreconfig.xml");
		//creating question
		Question q1 = (Question) context.getBean("qu");
	
		q1.setQuestionId(214);
		q1.setQuestion("what is collection framework");
		
		//creating answer
		
		Answer ans1 = (Answer) context.getBean("ans");
		
		ans1.setAnswerId(345);
		ans1.setAnswer("API for working with objects");
		ans1.setQues(q1);
		
		Answer ans2= new Answer();
		ans2.setAnswer("faremowrk");
		ans2.setAnswerId(346);
		ans2.setQues(q1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		
		q1.setAns(list);
		
		
		Session s= factory.openSession();
		s.beginTransaction();
		s.save(q1);
		s.save(ans1);
		s.save(ans2);
		s.getTransaction().commit();
		
		
		factory.close();


	}

}
