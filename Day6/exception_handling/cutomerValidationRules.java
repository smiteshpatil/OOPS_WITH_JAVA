package exception_handling;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import enums.ServicePlan;
import src.Customer;

public class cutomerValidationRules {

	// validate if user with specified email is already registered
	public static void checkDups(String email, List<Customer> customers) throws customerExceptions {

		for (Customer c : customers) {
			if (c.getEmail().equals(email)) {
				throw new customerExceptions("Email already exists!");
			}
		}

		/*
		 * can also use equals method with List.contains method (customer must override
		 * equal method for this using primary key)
		 */
	}

	// throws IllegalArgumentException Exc in case user chose ServicePlan
	public static ServicePlan parseServicePlan(String plan) throws IllegalArgumentException {
//		return ServicePlan.valueOf(plan.toUpperCase());
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// validate reg_amout according to ServicePlan
	public static int validateRegAmount(ServicePlan plan, int amount) throws customerExceptions {

		if (plan.getCharges() == amount)
			return amount;
		else
			throw new customerExceptions("Enter Valid Registration Amount !");
	}

	// validate dob
	public static LocalDate validateDob(String dob) throws DateTimeParseException {
		LocalDate ls = LocalDate.parse(dob);
		return ls;

	}

	// validate all user inputs
	public static Customer validateCustomerDetails(String firstName, String lastName, String email, String password,
			int regAmount, String dob, String plan, List<Customer> custs)
			throws IllegalArgumentException, customerExceptions {

		// validate email
		checkDups(email, custs);

		// validate ServicePlan
		ServicePlan p1 = parseServicePlan(plan);

		// validate Reg_amount
		validateRegAmount(ServicePlan.valueOf(plan), regAmount);

		// validate dob
		LocalDate ld = validateDob(dob);

		return new Customer(firstName, lastName, email, password, regAmount, ld, p1);
	}

	// validate customer login
	public static void authenticateUser(String username, String password,List<Customer> customers) throws customerExceptions {
    	
		//create temp customer to check if customer already exists
		Customer cust = new Customer(username);
		
		for(Customer c: customers)
		{
			if(c.equals(cust) && c.getPassword().equals(password))
			{
				System.out.println("Successfully Loged In... \n");
				return; // if customer logged in return 
			}
		}
		// customer not found throw exception
		throw new customerExceptions("Invalid Credentials! please try again\n");
		}
	
    //change user password
    public static void changePassword(String username,String password,String newPassword, List<Customer>customers) throws customerExceptions{
    	
    	//create temp customer to find actual customer
    	Customer temp = new Customer(username);    	
    	
    	for(Customer c: customers)
    	{
    		if(c.equals(temp) && c.getPassword().equals(password))
    		{
    			c.setPassword(newPassword);
    			System.out.println("Password upadted !");
    			return;
    		}    		
    	}
    	
    	throw new customerExceptions("Invalid credentials!\n");
    }
    
    
    //unSubscribe specified customer
    public static void unSubscribeCustomer(String username, List<Customer> customers) throws customerExceptions{
    
    	// type1 solution
    	for(Customer c:customers)
    	{
    		if(c.getEmail().equals(username))
    		{
    			customers.remove(c); // doesn't throw concurrentModification exception because of return
    			System.out.println("unsubscribed successfully!\n we regret to see you go, please tell us how we can improve.\n");
    			return;
    		}
    	}
    	//customer not found throw Exc
    	throw new customerExceptions("email not found!");
    	
    	/*Type2 Solution
    	 * Customer c = new Customer(username);
    	 * boolean removed = false;
    	 * removed = customers.remove(c);
    	 * if(!removed){throw new customerExceptions}
    	 * else{System.out.println("unsubscribed successfully!\n we regret to see you go, please tell us how we can improve.\n");}
    	 * 
    	 * */
    }
}
