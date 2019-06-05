package code.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MobilePhone
{
	@Autowired
	Processor cpu;
	
	public void showConfig()
	{
		System.out.println("Phone CPU");
		System.out.println(cpu);
	}
}