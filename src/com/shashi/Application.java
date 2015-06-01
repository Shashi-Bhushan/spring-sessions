package com.shashi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashi.shapes.Triangle;

public class Application {
	public static void main(String...strings){
		
		/*
		 * Bean Definition inheritance means inheriting definition of a Bean instead of rewriting the bean inheritance again and again.
		 * [
		 * 	for Eg. you have a bean definition of Points repeated in your spring.xml then in this case ,
		 * 	you would inherit definition of the bean instead of rewriting it.
		 * 
		 * 	their is an 'Abstract Bean Definition' which serves only as a template for beans.
		 * 	other beans inherit this 'Abstract Bean Definition' to give a structure  
		 * ]
		 */
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		Triangle triangle = (Triangle)context.getBean("triangle1");
		
		System.out.println("Initializing from Application Context : ");
		triangle.drawShape();

		/*
		 * This is the Second type of Bean
		 */
		Triangle secondTriangle = (Triangle)context.getBean("triangle2");
		
		System.out.println("Initializing from Application Context : ");
		secondTriangle.drawShape();
		
		/*
		 * in order to close context object here, need to use AbstractApplicationContext
		 * which registers a shutdown hook for java program so when the main method finish, the hook is called
		 * and the context also shuts down
		 * ONLY FOR JavaSE APPLICATIONS
		 * 
		 * after registering the shutdown hook, configure the init and destroy methods of the class Triangle
		 * 
		 * destroy method called when shutdown hook is initialized
		 */
	}
}
