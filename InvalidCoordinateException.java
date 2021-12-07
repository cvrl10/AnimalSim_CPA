
/**
 * This class represents a RuntimeException 
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class InvalidCoordinateException extends RuntimeException
{
	public InvalidCoordinateException(String exception)
	{
		super(exception+" are invalid coordinates");
	}//end preferred constructor
}//end class