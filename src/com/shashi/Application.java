package com.shashi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.shashi.shapes.Triangle;

public class Application {
	public static void main(String...strings){
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle)beanFactory.getBean("triangle");
		
		System.out.println("Initializing from Bean factory : ");
		triangle.drawShape();
	}
}
