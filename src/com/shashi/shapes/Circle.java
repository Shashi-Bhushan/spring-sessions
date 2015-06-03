package com.shashi.shapes;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

public class Circle implements Shapes {

	private Point center;
	
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
