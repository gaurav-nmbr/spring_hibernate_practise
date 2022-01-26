package com.springcore.stereotype;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/coreconfig.xml");
		
		Student stu =con.getBean("stud",Student.class);
		Address ad = con.getBean("address", Address.class);
		
		List<String> ls = new LinkedList<String>();
		ls.add("singrauli m.p");
		ls.add("nnttppcc");
		ad.setAddress(ls);
		
		System.out.println(ad);
		System.out.println(stu);
	}

}
