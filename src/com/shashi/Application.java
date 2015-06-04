package com.shashi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String...strings){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		Shapes shape = (Shapes)context.getBean("circle");
		shape.drawShape();
		
		/*
		 * The signature of Message called
		 * context.getMessage(messageKey, argsToPass, defaultMessage, locale);
		 */
		System.out.println ( context.getMessage("greeting" , null , "Default Greeting" , null) );
	}
}
