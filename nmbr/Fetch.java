package com.springcore.nmbr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.asm.Advice.AllArguments;

public class Fetch {
	public static void main(String[] args) {
		
	 SessionFactory facotry = new Configuration().configure("com/springcore/nmbr/hibconfig.xml").buildSessionFactory();
	 
	 Session session=facotry.openSession();
	 //get-student id
	  Base st = (Base)session.get(Base.class,101);
	  System.out.println("the deatils are " + st);
	  
	  Address ad = (Address)session.get(Address.class,1);
	  System.out.println(ad.getCity() +" : "+ ad.getCity());
	 
	 
	 session.close();
	 facotry.close();
	}
}
