package com.shashi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashi.shapes.Triangle;

public class Application {
	public static void main(String...strings){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		
		System.out.println("Initializing from Application Context : ");
		triangle.drawShape();
		
	}
}
