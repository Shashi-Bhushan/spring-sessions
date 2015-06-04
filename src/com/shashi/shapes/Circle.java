package com.shashi.shapes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.shashi.Shapes;
import com.shashi.shapes.point.Point;

/*
 * Marks the Circle as a Bean
 * no need to define it in spring.xml file
 * 
 * equivalent to creating bean in xml
 * <bean name="circle" class=""></bean>
 * 		-> Name of bean is circle in smallCase
 * 
 * DISADVANTAGE is
 * 		-> you would have to either have to have only one class per @Component annotation
 * 		   or have to have metadata in spring.xml file.
 * 		Eg. 3 different Point beans in spring.xml then either create 3 Point classes and specify @Component
 * 			or define 3 different beans in spring.xml 
 * 
 * @Component is a generic annotation and can be used across application.
 * Their are special cases of @Component annotation, which are used for particular purpose.
 * 		-> @Service 	– 	Annotate classes at service layer level.
 * 		-> @Controller 	– 	Annotate classes at presentation layers level, mainly used in Spring MVC. 		[Controller of MVC]
 * 		-> @Repository 	– 	Annotate classes at persistence layer, which will act as database repository. 	[Model of MVC]
 */
@Service
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
