package custmorStack;

import java.util.Scanner;

public class TestCustomerStack {

	public static void main(String[] args) {
		
	//create scanner
		Scanner sc = new Scanner(System.in);
		
		Stack customers = null;
		
		System.out.println("Welcome to Customer Record Center:");
		System.out.println("\n1.Choose FixedSize Stack\n2.Choose Growable Stack");
		
		int choice = sc.nextInt();
	
		if(choice ==1 )
		{
			customers = new FixedStack();
		}
		else if(choice == 2)
		{
			customers = new Growable();
		}

		
	//temporary variables for getting customer details
		String name, addr;
		int id;
		
		
		// Implementation of customer record operations		
		do
		{
			System.out.println("\n3.Push Data\n4.Pop Data and Display\n5.EXIT");
			choice = sc.nextInt();
			
			switch (choice) {
			case 3:
				// taking customer details
				System.out.println("Enter Customer Name:");
				name = sc.next();
				System.out.println("Enter Customer address:");
				addr = sc.next();
				System.out.println("Enter Customer id:");
				id = sc.nextInt();
				
				//pushing new customer to record
				customers.push(new Customer(id,name,addr));
				System.out.println("Customer details added successfully !");
				
				break;

			case 4:
				customers.pop();
				break;
			case 5:
				System.out.println("EXIT SUCCESS!");
				
			}
			
		}while(choice != 5);
			

	}

}
