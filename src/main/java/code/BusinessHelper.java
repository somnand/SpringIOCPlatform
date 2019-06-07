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
	@Before("execution(* work())")	
	public void logBefore()
	{
		System.out.println("Starting of business task output!!");
	}
	
	@After("execution(* work())")
	public void logAfter()
	{
		System.out.println("End of the business task output!!");
	}
}
