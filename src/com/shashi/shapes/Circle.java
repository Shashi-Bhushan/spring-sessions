package com.shashi.shapes;


import org.springframework.beans.factory.annotation.Autowired;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

public class Circle implements Shapes {

	private Point center;
	
	/*
	 * Marks that this setter is to be Autowired by Type
	 * 
	 * AutowiredAnnotationBeanPostProcessor bean needs to be created as well for this.
	 * their is an unambiguous byType Point Bean ins pring.xml so it'll resolve and autowire that Bean in this Setter function 
	 */
	@Autowired
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

}
