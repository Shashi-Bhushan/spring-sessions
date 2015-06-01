package com.shashi.shapes;

import java.util.List;

import org.springframework.context.ApplicationContext;

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
public class Triangle {

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
	
	/*
	 * Call this as init-method in spring.xml
	 */
	public void customInit(){
		System.out.println("This init method of Triangle Class is not specific to Spring only.");
	}
	
	/*
	 * Call this as destory-method in spring.xml
	 */
	public void customCleanUp(){
		System.out.println("This Destroy Method of Triangle Class is not specific to Spring only.");
	}
	
	/*
	 * GLOBAL init and Destroy
	 */
	public void globalInit(){
		System.out.println("This is the Global Init Method for Traingle Bean");
	}
	
	public void globalCleanUp(){
		System.out.println("This is the Global Destroy Method for Traingle Bean");
	}
}
