package com.jspiders.pkg1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class User 
{
	public static void main(String[] args) 
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		
		HomeAddress h1 = (HomeAddress)container.getBean("address");
		h1.area();
		
		HomeAddress h2=(HomeAddress)container.getBean("address1");
		h2.area();
		
		WorkAddress w1 = (WorkAddress)container.getBean("address2");
		w1.office();
	}
}
