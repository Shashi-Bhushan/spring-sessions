package com.shashi.shapes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

public class Circle implements Shapes {

	private Point center;
	
	/*
	 * Marks that this setter is a Resource 
	 * 
	 * Resource is a JSR-250 annotation(from javax.annotation package) i.e. it's not specific to Spring.
	 * it's capable of injecting byName but if i won't specify the name here and their is a bean named center in spring.xml
	 * then that ean will be injected in this setter.
	 */
	@Resource(name="pointC")
	public void setCenter(Point center){
		this.center = center;
	}
	
	public Point getCenter(){
		return center;
	}
	
	@Override
	public void drawShape() {
		System.out.println("Center Point of circle is : ( " + this.center.getX() + ", " + this.center.getY() + " )");
	}
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init Method of Circle.");
	}
	
	/*
	 * only work if the shutdown hook is registered.
	 * for that need to call
	 * 		-> abstractApplicationContextObject.registerShutdownHook();
	 */
	@PreDestroy
	public void disposeCircle(){
		System.out.println("Dispose Method of Circle");
	}

}
