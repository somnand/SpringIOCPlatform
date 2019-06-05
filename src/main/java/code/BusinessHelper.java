package code;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class BusinessHelper
{
	@Before("execution(public void work())")
	public void logBefore()
	{
		System.out.println("Logging before the business task");
	}
	
	@After("execution(public void work())")
	public void logAfter()
	{
		System.out.println("Logging after the business task");
	}
}
