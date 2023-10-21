

public class Point2D{
	private int x;
	private int y;
		
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String show()
	{
		return "X co-ord: "+x+" Y Co-ord: "+y;
	}		
	
	public boolean isEqual( Point2D p2)
	{
		if(x==p2.x && y==p2.y)
			return true;
			
		return false;
	}
	
	public double calculateDistance(Point2D p2)
	{
		double dist = Math.sqrt((p2.x -x)*(p2.x-x) + (p2.y-y)*(p2.y-y));
		return dist;		
	}
}

