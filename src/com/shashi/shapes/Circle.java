package com.shashi.shapes;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

@Component
public class Circle implements Shapes,ApplicationContextAware {

	private Point center;
	ApplicationContext context;
	
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
		
		/*
		 * The signature of Message called
		 * context.getMessage(messageKey, argsToPass, defaultMessage, locale);
		 */
		System.out.println ( "context.getMessage() call from Circle class : " );
		System.out.println ( context.getMessage("greeting" , null , "Default Greeting" , null) );
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// setting context value in instance variable
		this.context = context;
	}

}
