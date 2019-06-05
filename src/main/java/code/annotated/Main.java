package code.annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(PhoneConfig.class);
		
		MobilePhone samsungPhone = context.getBean(MobilePhone.class);
		
		samsungPhone.showConfig();
	}
}
