package com.app.fruits;

public class Fruit {

	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	public static int count;
	
	// default constructor
	Fruit(){}
	
	
	//set fruit values
	public void setDetails(String clr,double wt,String name, boolean fresh) {
		color = clr;
		weight = wt;
		this.name = name;
		this.fresh = fresh;
	}
	
	
	// getter for fruit
	
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public double getWeight()
	{
		return weight;
	}
	public boolean getFresh()
	{
		return fresh;
	}
	
	
	public String taste() {
		return "no specific taste";
	}
	
	
	
}
