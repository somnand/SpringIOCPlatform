package code.annotated;

public class Processor
{
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
