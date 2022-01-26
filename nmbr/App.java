package com.springcore.nmbr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.nmbr.Base;
import com.springcore.nmbr.Address;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure("com/springcore/nmbr/hibconfig.xml").buildSessionFactory();
//        System.out.println(factory);
        
        //creating student
        
//       Base st = new Base();
//       st.setId(102);
//       st.setName("babu");
//       st.setCity("waidhan");
//       System.out.println(st);
        
        // creating beans for base class
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/nmbr/coreconfig.xml");
		Base st =(Base) context.getBean("st");
		Base st1 =(Base) context.getBean("st");
		st1.setCity("jamnage");
		st1.setId(124);
		st1.setName("gauravvv");
		st.setId(102);
		st.setName("kallu02");
		st.setCity("mirzapur3");
		Certificate certi = (Certificate) context.getBean("certi");
		certi.setCourse("python");
		certi.setDuration("1_months");
		st.setCerti(certi);
		System.out.println(st.toString());
		
		//creating beans for address class
//		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/nmbr/coreconfig.xml");
//		Address ad =(Address) context1.getBean("ad");
//		ad.setStree("street1");
//		ad.setCity("delhi");
//		ad.setOpen(true);
//		ad.setAddedDate(new Date());
//		ad.setX(1234.1234);
//		FileInputStream fis= new FileInputStream("src/main/java/com/springcore/nmbr/img.jpg");
//		byte[] data=new byte[fis.available()];
//		fis.read(data);
//		ad.setImage(data);
//		

      
       Session session = factory.openSession();
       //TODO
       session.beginTransaction();
       session.save(st);
//       session.save(ad);
       session.getTransaction().commit();
       
       
       session.close();
       
        
    }
}
