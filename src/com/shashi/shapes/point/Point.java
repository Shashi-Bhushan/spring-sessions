package com.shashi.shapes.point;

public class Point {
	private int x;
	private int y;
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return y;
	}
	
	@Override
	public String toString(){
		return this.getX() + " - " + this.getY();
	}
}
