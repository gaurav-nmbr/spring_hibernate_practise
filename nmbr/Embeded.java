package com.springcore.nmbr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Embeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("com/springcore/nmbr/hibconfig.xml").buildSessionFactory();
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/nmbr/coreconfig.xml");
		Base st =(Base) context.getBean("st");
		st.setId(005);
		st.setName("babua");
		st.setCity("waidhan");
		
		
		Certificate certi=(Certificate) context.getBean("certi");
		certi.setCourse("android");
		certi.setDuration("1._months");
		st.setCerti(certi);
		
		
	
		
	       Session session = factory.openSession();
	       //TODO
	       session.beginTransaction();
	       session.save(st);
	       session.getTransaction().commit();
	       session.close();
	       factory.close();
	}

}
