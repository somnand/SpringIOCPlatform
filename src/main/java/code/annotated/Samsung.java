package code.annotated;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung
{
	@Autowired
	Processor cpu;
	
	public void showConfig()
	{
		System.out.println("Phone CPU");
		System.out.println(cpu);
	}
}