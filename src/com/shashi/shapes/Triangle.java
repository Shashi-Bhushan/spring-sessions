package com.shashi.shapes;

import com.shashi.shapes.point.Point;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
}
