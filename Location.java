
/**
 * This class encapsulates a point on a simulation map.
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class Location 
{
	int xCoord;//the x-coordinate on a simulation map
	int yCoord;//the y-coordinate on a simulation map
	
	/**
	 * The empty-argument constructor initializes xCoord and yCoord to zero.
	 */
	public Location()
	{
		this(0, 0);
	}//end empty-argument constructor
	
	/**
	 * 
	 * @param x the value of x to update
	 * @param y the value of y to update
	 */
	public Location(int x, int y)
	{
		update(x, y);
	}//end preferred constructor
	
	/**
	 * 
	 * @param x the value of x to update 
	 * @param y the value of y to update
	 */
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
	
	/**
	 * 
	 * @return an integer array of the x-coordinate and y-coordinate
	 */
	public int[] getCoordinates()
	{
		int[] array = {xCoord, yCoord};
		return array;
	}//end getCoordinates
}//end class
