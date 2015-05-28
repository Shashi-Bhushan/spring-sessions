package com.shashi.shapes;

public class Triangle {

	private String type;
	private int side;
	
	/*
	 * Constructors 
	 */
	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(int side) {
		super();
		this.side = side;
	}

	public Triangle(String type, int side) {
		super();
		this.type = type;
		this.side = side;
	}

	/*
	 * Getters and Setters
	 */
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	/*
	 * Draw shape Method
	 */
	public void drawShape(){
		System.out.println( "drawing Traingle Shape of Type :" + this.getType() + " and Side : " + this.getSide() );
	}
}
