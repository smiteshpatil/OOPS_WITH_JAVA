import java.util.Scanner;

public class TestPoints {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many points to plot:");
		int n =sc.nextInt();
		
		Point2D[] points = new Point2D[n];
		
		
		int choice,index,x,y;
		
		do {
			System.out.println("1.Plot a point\n2.Display x,y co-ordinates of all the points plotted so far\n3.Check if two points are equal\n0.EXIT");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter array index, x, y");
				
				index = sc.nextInt();
				x = sc.nextInt();
				y =sc.nextInt();
				
				if(index <n && index >= 0)
				{
					points[index] = new Point2D(x,y);
					System.out.println("Point successfully ploted!");
				}
				else
				{
					System.out.println("Index out of bound !");
				}
				
				break;

			case 2:
				for(Point2D p: points)
				{
					if(p==null)
					{
						System.out.println("No point ploted!");
						continue;
					}
					p.show();
				}
				break;
				
			case 3:
				System.out.println("Enter indices of 2 points to compare: ");
				
				// compare two points at index p1 and p2
				int p1,p2;
				p1 =sc.nextInt();
				p2 = sc.nextInt();		
				
				if(p1>=0 && p1<n) {
					if(p2>=0 && p2<n) {
						if(points[p1].isEqual(points[p2]))
							System.out.println("p1 and p2 are equal");
					}else 
						System.out.println("p2 out of bound");
				}
				else {
					System.out.println("p1 out of bound");
				}
				
			// check for points equality
				if(points[p1].isEqual(points[p2]))
					System.out.println("Points are equal ");
				else
					System.out.println("points are different with distance of "+ points[p1].calculateDistance(points[p2]));
				
				break;
				
			case 0:
				System.out.println("EXIT SUCCESS !");
				break;
			}
		}while(choice != 0);
	}
}
