package com.shashi.shapes;

import java.util.List;

import com.shashi.shapes.point.Point;

public class Triangle {

private List<Point> points;
	
	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void drawShape(){
		for(Point point: points){
			System.out.println("Point ("+point.getX()+","+point.getY()+")");
		}
	}
}
