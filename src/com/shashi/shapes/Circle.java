package com.shashi.shapes;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

@Component
public class Circle implements Shapes {

	private Point center;
	/*
	 * @Resource can also be used here
	 */
	@Autowired
	private MessageSource messageSource;
	
	@Resource(name="pointC")
	public void setCenter(Point center){
		this.center = center;
	}
	
	public Point getCenter(){
		return center;
	}
	
	/*
	 * do the dependency injection and assign messageSource bean here
	 * can be done byType because their is only one bean of this type in spring.xml
	 */
	public void setMessageSource(MessageSource messageSource){
		this.messageSource = messageSource;
	}
	
	@Override
	public void drawShape() {
		System.out.println("Center Point of circle is : ( " + this.center.getX() + ", " + this.center.getY() + " )");
		
		/*
		 * MessageSource is the interface implemented by ApplicationContext as well as ResourceBundleMessageSource.
		 * As seen in last commit, we can either use the ApplicationContext and call getMessage of that object
		 * 		OR
		 * we can do a getBean for messageSource and call it's getMessage()
		 */
		System.out.println ( "context.getMessage() call from Circle class : " );
		System.out.println ( messageSource.getMessage("greeting" , null , "Default Greeting" , null) );
	}

}
