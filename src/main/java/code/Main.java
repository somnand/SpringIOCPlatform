package code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "code" })
public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);		
		
		BusinessWorker worker = context.getBean(BusinessWorker.class);
		worker.work();
		worker.talk();		
	}
}
