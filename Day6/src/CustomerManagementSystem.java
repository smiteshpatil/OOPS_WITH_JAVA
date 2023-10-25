package src;

import java.util.*;

import custom_sorting.CustomSort;

import static exception_handling.cutomerValidationRules.*;

public class CustomerManagementSystem {
    public static void main(String[] args) {
        System.out.println("\nWelcome to customer management system !\n");

        // creating customer record (DS)
        List<Customer> customers = new ArrayList<Customer>();

        boolean exit = false;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println(
                        "1.Sign up\n2.Sign in\n3.Change Password\n4.Un subscribe customer\n5.Display all customers\n6.Natural sort\n7.CustomSort(firstName)\n0.EXIT");

                int choice; 

                try {

                    switch (choice = sc.nextInt()) {

                        case 1:

                            System.out.println("Enter firstName, lastName, email, password, regAmount, dob, plan");

                            Customer c1 = validateCustomerDetails(sc.next(), sc.next(), sc.next(), sc.next(),
                                    sc.nextInt(), sc.next(), sc.next().toUpperCase(), customers);

                            customers.add(c1);
                            System.out.println("customer added successfully!");
                            break;
                            
                        case 2:
                        	
                        	// take username and password from user and authenticate sign in
                        	System.out.println("Enter username and password:");
                        	authenticateUser(sc.next(),sc.next(),customers);
                        	break;
                        
                        case 3:
                        	System.out.println("enter username, current password and new password:");
                        	changePassword(sc.next(),sc.next(),sc.next(),customers);
                        	break;
                        	
                        case 4:
                        	System.out.println("enter username to unsubscribe:");
                        	unSubscribeCustomer(sc.next(),customers);
                        	System.out.println("user unsubscribed !");
                        	break;

                        case 5:
                            System.out.println("All customers in system:");
                            for (Customer c : customers) {
                                System.out.println(c);
                            }
                            break;
                        case 6:
                            System.out.println("\nNatural sorting:");
                            Collections.sort(customers);
                            System.out.println(customers);
                            break;
                            
                        case 7:
                        	System.out.println("\nCustom sorting based on firstName:");
                        	Collections.sort(customers,new CustomSort());
                        	System.out.println(customers);
                        	break;
                        case 0:
                        	System.out.println("EXIT SUCCESS !");
                            exit = true;
                            break;
                    }
                }

                catch (Exception e) {
                	e.printStackTrace();
                    sc.nextLine();

                }
            }

            while (!exit);
        }
    }
}