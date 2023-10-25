package custom_sorting;

import java.util.Comparator;

import src.Customer;

public class CustomSort implements Comparator<Customer>{
	
	public int compare(Customer c1, Customer c2) {
		
		return c1.getFirstName().compareTo(c2.getFirstName());
	}
}
