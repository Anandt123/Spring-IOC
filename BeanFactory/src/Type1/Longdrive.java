package com.jspiders.pkg3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Longdrive {

	public static void main(String[] args) {
		
		BeanFactory container = new XmlBeanFactory(new FileSystemResource("config.xml"));
		WithGF g1 = (WithGF)container.getBean("anand12");
		g1.ondrive();
		WithoutGF g2 = (WithoutGF)container.getBean("anand21");
		g2.Ondrive();
	}

}
