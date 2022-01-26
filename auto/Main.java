package com.springcore.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/coreconfig.xml");
		
		Emp emp1 = (Emp) context.getBean("emp");
		
//		Address add = (Address) context.getBean("add");
		
		System.out.println(emp1);
//		System.out.println(add);
		
		emp1.getAddress();
		System.out.println(emp1.getAddress());
//		

	}

}
