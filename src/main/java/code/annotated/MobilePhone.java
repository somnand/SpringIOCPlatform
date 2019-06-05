package code.annotated;

import org.springframework.beans.factory.annotation.Autowired;

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