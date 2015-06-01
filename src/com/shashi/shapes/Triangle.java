package com.shashi.shapes;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.shashi.shapes.point.Point;

/*
 * ApplicationContextAware 	: to get hold of context object initialized in Application class
 * BeanNameAware 			: to use the bean Name. I'm just printing the bean name representing this(TRIANGLE) class in xml file
 *  
 * InitializingBean 	: used when TriangleBean needs to know when it's being initialized(IT's a MARKER interface as well)
 * DisposableBean 		: used when TriangleBean needs to know when it's being destroyed
 * DISADVANTAGE :
 * 		both interfaces are specific to Spring. so the bean is bound to use the spring framework this way.		
 */
public class Triangle implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean {

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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing Bean init Method called for Triangle");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying Bean destroy Method called for Triangle");
	}
}
