package code.annotated;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Intel implements Processor
{
	public Intel()
	{
		super();
		this.cpuName="Intel-M220";
	}
	
	private String cpuName;

	public String getCpuName()
	{
		return cpuName;
	}

	public void setCpuName(String cpuName)
	{
		this.cpuName = cpuName;
	}

	@Override
	public String toString()
	{
		return "Processor [cpuName=" + cpuName + "]";
	}
}
