package code;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	private String company = "MRF";
	
	@Override
	public String toString()
	{
		return "Tyre [company=" + company + "]";
	}

}
