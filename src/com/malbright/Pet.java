package com.malbright;

public class Pet {
	// About the pet
	private String name;
	private String location;
	private String breed;
	private int age;
	private boolean bark;
	private String calm;
	private String fetch;
	
	
	
	public Pet()
	{
		
	};
//	{
//	//	name = "TBD";
//	//	age = 0;
//	//	location = "TBD";
//	//	breed = "TBD";
//	}
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getBreed() 
	{
		return breed;
	}
	
	public void setBreed(String breed) 
	{
		this.breed = breed;
	}
	// pets behaviors
	public void isbark() 
	{
		System.out.println("This one is a great guard dog!");
	}
	
	public void calm()
	{
		System.out.println("This rascal loves kids!");
	}
	
	public void fetch() 
	{
		System.out.println("This little gut loves to play!");
	}
	
	public Pet(String name, String location, String breed, int age) 
	{
		this.name = name;
		this.location = location;
		this.breed = breed;
		this.age = age;
	}
	
	
	
	
	

	

}
