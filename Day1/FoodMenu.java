/*
Display food menu to user. User will select items from menu along with the quantity.
 (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food 
 items(hard code the prices) When user enters 'Generate Bill' , display total bill
 and  exit.
*/

import java.util.Scanner;

public class FoodMenu{
    public static void main(String[] args) {

        int bill=0, quantity,choice;
        
        System.out.println("Welcome to Food Court !");

    // create scanner object to take inputs 
        Scanner sc = new Scanner(System.in);
       
        //menu driven program 
        do{
            System.out.println("\nMenu:\n1.Dosa\n2.Samosa\n3.Idli\n4.Generate Bill\n5.EXIT");
            //taking user choice
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Enter the quantity for Dosa:");
                quantity = sc.nextInt();
                //   price x qnt
                bill += 30 * quantity; 
                break;

                case 2:
                System.out.println("Enter the quantity for Samosa:");
                quantity = sc.nextInt();
                bill += 10 * quantity;
                break;

                case 3:
                System.out.println("Enter the quantity for Idli:");
                quantity = sc.nextInt();
                bill += 20 * quantity;
                break;

                case 4:
                System.out.println("Total bill :"+ bill);
                break;

                case 5:
                System.out.println("EXIT SUCCESS !");
            
                
            }
        }while(choice != 5);
    }
}


