package Day8.var_args;

public class TestVarArgs {
    public static void main(String[] args) {
        // test for variable arguments

        System.out.println("--------No args------------");
        displayDetails();

        // arg[]
        displayDetails(new Fruit[] { new Apple(), new Orange() });
        System.out.println("--------------------------");

        // Fruit : , seperated
        displayDetails(new Orange(), new Apple());

        // printf : formatted printing : Emp details
        System.out.printf("ID %d Name %s Salary %.1f %n", 101, "Smitesh", 1234.567);
    }

    static void displayDetails(Fruit... fruits) {
        for (Fruit f : fruits)
            System.out.println(f);
    }
}

class Fruit {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}
