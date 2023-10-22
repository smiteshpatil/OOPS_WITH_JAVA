import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {

		// creating scanner
		Scanner sc = new Scanner(System.in);

		// input basket size
		System.out.println("Enter basket size");
		int n = sc.nextInt();

		// Basket to store all fruits
		Fruit[] Basket = new Fruit[n];

		int choice, i = 0;
		do {
			System.out.println("\n1.Add Mango \n2.Add Orange \n3.Add Apple\n4.Display ALL\n 5. 0.EXIT");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					if (i < n)
						Basket[i++] = new Mango("Yellow", 0.5, true);
					else
						System.out.println("Basket Full");
					break;

				case 2:
					if (i < n)
						Basket[i++] = new Orange("Orange", 0.5, true);
					else
						System.out.println("Basket Full");
					break;

				case 3:
					if (i < n)
						Basket[i++] = new Apple("Red", 0.5, true);
					else
						System.out.println("Basket Full");
					break;

				case 4:
					for (Fruit f : Basket) {
						System.out.println(f.getName());
					}
					break;
				case 0:
					System.out.println("EXIT SUCCESS!");
					break;
			}
		} while (choice != 0);

		sc.close();
	}

}
