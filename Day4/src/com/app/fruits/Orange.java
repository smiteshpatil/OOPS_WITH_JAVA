package com.app.fruits;

public class Orange extends Fruit{
	
	
	//default constructor
	public Orange(){
		count++;
	};
	
	//parameterized Constructor
	public Orange(String clr,double wt, boolean fresh)
	{	
		super.setDetails(clr,wt,"Orange",fresh);
		count++;
	}
	
	public void pulp()
	{
		System.out.println(getName()+ " "+getWeight());
		System.out.println("Extracting juice!");
	}
	
	public String taste()
	{
		return "sour";
	}		
}