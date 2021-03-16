package com.jspiders.pkg2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Hotel 
{
	public static void main(String[] args) 
	{	
		ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
		//BeanFactory container = new XmlBeanFactory(new FileSystemResource("config.xml"));
		
		Lunch l1 = (Lunch) container.getBean("ak12");
		l1.hadLunch();
		Breakfast b1 = (Breakfast)container.getBean("ak21");
		b1.hadBreakfast();
	}
}
