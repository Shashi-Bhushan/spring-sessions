package com.shashi.shapes;

import java.util.List;

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

	private List<Point> points;
	private ApplicationContext context;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void drawShape(){
		for(Point point : points){
			System.out.println( "Point( x " + point.getX() + ", y " + point.getY() + " )" );
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		// System.out.println("ApplicationContext is : " + context);
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		// System.out.println("Bean Name is : " + beanName);
	}
}
