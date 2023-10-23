package custmorStack;

import java.util.ArrayList;

public class Growable implements Stack {
	
	private int TOP = -1;
	
	private ArrayList<Customer> GrowableStack = new ArrayList<Customer>(Stack.SIZE);

	@Override
	public void push(Customer c) {
		if(isFull())
		{
		System.out.println("Stack is Full");
		}
		else
		{
			++TOP;
			GrowableStack.add(c);
		}		
	}

	@Override
	public void pop() {
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(GrowableStack.get(TOP).toString());		
			GrowableStack.remove(GrowableStack.remove(TOP--));
		}
		
		
	}

	@Override
	public boolean isFull() {
		return TOP == Stack.SIZE-1 ? true: false;
	}

	@Override
	public boolean isEmpty() {
		return TOP == -1 ? true : false;
	}
}
