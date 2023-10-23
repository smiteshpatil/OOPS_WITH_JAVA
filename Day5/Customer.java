package custmorStack;

public class Customer 
{
	private int id;
	private String name;
	private String addr;
	
//default Constructor
	public Customer(){};

	
//copy Constructor
	public Customer(Customer c)
	{
		id = c.id;
		name = c.name;
		addr = c.addr;
	}
	
	
//Parameterized Constructor
	public Customer(int id, String name, String addr)
	{
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
// print information of customer
	public String toString()
	{
		return "Customer Info:\n"+"Name: "+name+" id: "+id+" addr:"+addr;
	}
}
