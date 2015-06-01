package com.shashi.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.shashi.shapes.point.Point;

/*
 * ApplicationContextAware : to get hold of context object initialized in Application class
 * BeanNameAware : to use the bean Name. I'm just printing the bean name representing this(TRIANGLE) class in xml file 
 */
public class Triangle implements ApplicationContextAware,BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	public Point getPointA(){
		return pointA;
	}
	
	public void setPointA(Point pointA){
		this.pointA = pointA;
	}
	
	public Point getPointB(){
		return pointB;
	}
	
	public void setPointB(Point pointB){
		this.pointB = pointB;
	}
	
	public Point getPointC(){
		return pointC;
	}
	
	public void setPointC(Point pointC){
		this.pointC = pointC;
	}
	
	public void drawShape(){
		System.out.println( "Point A : " + this.getPointA() + " | Point B : " + this.getPointB() + " | Point C : " + this.getPointC() );
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("ApplicationContext is : " + context);
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name is : " + beanName);
	}
}
