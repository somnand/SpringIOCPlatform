package code.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfig
{
	@Bean
	public Processor getProcessor()
	{
		Processor cpu = new Snapdragon();
		//cpu.setCpuName("Snapdragon-650");
		//cpu.setCpuName("Intel-M220");
		return cpu;		
	}
	
	@Bean
	public MobilePhone getSamsung()
	{
		return new MobilePhone();
	}

}
