package custmorStack;

public interface Stack{
	
	int SIZE = 5;
	
	void push(Customer c);
	void pop();
	boolean isFull();
	boolean isEmpty();
}
