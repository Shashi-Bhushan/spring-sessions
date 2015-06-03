package com.shashi.shapes;

import org.springframework.beans.factory.annotation.Required;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

public class Circle implements Shapes {

	private Point center;
	
	/*
	 * Marks that this setter and thus the Point 'center' is Required.
	 * Note that this Required annotation won't work by itself
	 * 
	 * RequiredAnnotationBeanPostProcessor bean needs to be created as well for this.
	 */
	@Required
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
