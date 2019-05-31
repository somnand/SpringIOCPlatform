package code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	String carName;
	
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
		
	public String getCarName()
	{
		return carName;
	}
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	public void drive()
	{
		System.out.println("Car is running with "+tyre);
	}
}
