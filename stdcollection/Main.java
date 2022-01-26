package com.springcore.stdcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stdcollection/coreconfig.xml");
		
		Person p = con.getBean("person1",Person.class);
		System.out.println(p.getFriends());
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println(p.getFeestructure());
		System.out.println(p.getProp());

	}

}
