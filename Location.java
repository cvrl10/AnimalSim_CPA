
public class Location 
{
	int xCoord;
	int yCoord;
	public Location()
	{
		this(0, 0);
	}//end empty-argument constructor
	public Location(int x, int y)
	{
		update(x, y);
	}//end preferred constructor
	public void update(int x, int y)
	{
		try
		{
			if ( x < 0 || y < 0)
				throw new InvalidCoordinateException("("+x+","+y+")");
			xCoord = x;
			yCoord = y;
			
		}
		catch(InvalidCoordinateException exception)
		{
			System.out.println(exception.getMessage());
		}
	}//end update
	public int[] getCoordinates()
	{
		int[] array = {xCoord, yCoord};
		return array;
	}//end getCoordinates
}//end class
