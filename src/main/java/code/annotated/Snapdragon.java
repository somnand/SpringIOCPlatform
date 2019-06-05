package code.annotated;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Processor
{
	public Snapdragon()
	{
		super();
		this.cpuName="Snapdragon-650";
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
