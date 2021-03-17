package com.jspider.pkg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZomatoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new ClassPathXmlApplicationContext("Config.xml");
		User u1 = (User)container.getBean("escn");
		System.out.println(u1);
	}
}
