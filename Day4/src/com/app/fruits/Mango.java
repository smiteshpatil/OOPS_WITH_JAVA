package com.app.fruits;

public class Mango extends Fruit{
		
	//default constructor
	public Mango(){
		count++;
	};
	
	//parameterized Constructor
	public Mango(String clr,double wt, boolean fresh)
	{	
		super.setDetails(clr,wt,"Mango",fresh);
		count++;
	}
	
	
	public String taste(){
		return "sweet";
	}	
	
	public void pulp()
	{
		System.out.println(getName()+ " "+getColor());
		System.out.println("Creating pulp!");
	}
}