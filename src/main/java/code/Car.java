package code;

public class Car implements Vehicle
{
	String carName;
	
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
		System.out.println("Car is running!!");
	}
}
