package code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Using Spring version of 5.1.7 
 * XML XSD version is supported till 4.3 and thus the spring beans definition is 4.3
 * <code>
 * <beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-4.3.xsd">
   </code>
 * 
 * @author Somsurya Nanda
 *
 */
public class Main 
{
    public static void main(String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application_components.xml");
    	System.out.println("Using Spring IOC - Version 5.1.7");
    	
        Car car = (Car)context.getBean("car");
        car.drive();
        System.out.println("Car name : "+car.getCarName());
        Vehicle vehicle = (Vehicle)context.getBean("bike");
        vehicle.drive();
        
        
    }
}
