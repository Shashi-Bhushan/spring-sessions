package com.shashi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashi.shapes.Triangle;
import com.shashi.shapes.point.Point;

public class Application {
	public static void main(String...strings){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle-alias");
		
		System.out.println("Initializing from Application Context : ");
		triangle.drawShape();
		
		Point point = new Point();
		point.setX(35);
		point.setY(70);
		triangle.setPointA(point);
		triangle.drawShape();

		/*
		 * This bean is the same as previous bean
		 * Single object
		 */
		Triangle secondTriangle = (Triangle)context.getBean("triangle-alias");
		
		System.out.println("Initializing from Application Context : ");
		secondTriangle.drawShape();
	}
}
