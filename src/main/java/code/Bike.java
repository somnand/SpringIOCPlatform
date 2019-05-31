package code;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	String bikeCompany;
	
	public Bike(String bikeCompany) 
	{
		super();
		this.bikeCompany = bikeCompany;
	}

	public void drive() 
	{
		System.out.println("Bike is running!!");
	}

	@Override
	public String toString() {
		return "Bike [bikeCompany=" + bikeCompany + "]";
	}}
