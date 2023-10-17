import java.util.Scanner;

public class Calculator{
    public static void main(String[] args)
    {
    //create scanner 
        Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Calculator App!");

    // accept two numbers from user
        int num1,num2;
        System.out.println("Specify Two Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

    //implementing Calculator logic
    int choice;
        do{
            System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n0.EXIT");
            choice = sc.nextInt();

            switch(choice)
            {
                case 0:
                System.out.println("EXIT SUCCESS !");
                break;
                
                case 1:
                System.out.println(num1+" + "+num2 + " = "+(num1+num2));
                break;
                
                 case 2:
                System.out.println(num1+" - "+num2 + " = "+(num1-num2));
                break;

                 case 3:
                System.out.println(num1+" * "+num2 + " = "+(num1*num2));
                break;

                 case 4:
                 if(num2==0)
                    System.out.println("division By zero Error !");
                 else
                 {
                    System.out.println(num1+" / "+num2 + " = "+(num1/num2));
                 }
                break;   
            }
        }while(choice != 0);

      
    }
}

    