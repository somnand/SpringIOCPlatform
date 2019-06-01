package code.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfig
{
	@Bean
	public Processor getProcessor()
	{
		Processor cpu = new Processor();
		cpu.setCpuName("Intel");
		return cpu;		
	}
	
	@Bean
	public Samsung getSamsung()
	{
		return new Samsung();
	}

}
