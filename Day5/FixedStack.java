package custmorStack;

public class FixedStack implements Stack{
	
	private int TOP = -1;	
	
// customer array to store customer details
	Customer[] array = new Customer[Stack.SIZE];
	
// Add new Customer to customer array
	public void push(Customer c)
	{
		if(isFull())
		{
			System.out.println("Stack Full!");
		}
		else 
		{
			array[++TOP] = new Customer(c);
		}
	}

//removes last customer and display the same
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty !");
		}
		else
		{
			//print last poped customer and reduce top 
			System.out.println(array[TOP--].toString());			
		}
	}
	
	
// check StackOverflow
	public boolean isFull()
	{
		return TOP == Stack.SIZE -1 ?true:false;
	}
	
//check StackUnderflow
	public boolean isEmpty()
	{
		return TOP == -1 ? true : false;
	}
}
