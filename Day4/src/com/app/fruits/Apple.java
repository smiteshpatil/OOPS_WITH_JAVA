package com.app.fruits;

public class Apple extends Fruit{
	
	//default constructor
	public Apple(){
		count++;
	};
	
	public Apple(String clr,double wt, boolean fresh)
	{	
		super.setDetails(clr,wt,"Apple",fresh);
		count++;
	}
	
	
	public void jam()
	{
		System.out.println(getName());
		System.out.println(" Making jam!");
	}
	
	// taste method
	public String taste(){
		return "sweet n sour";
	}		
}
