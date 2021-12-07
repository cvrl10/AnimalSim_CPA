
/**
 * This class represents a RuntimeException 
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class InvalidSimIDException extends RuntimeException
{
	public InvalidSimIDException(String exception)
	{
		super(exception+" is an invalid sim ID");
	}//end preferred constructor
}//end class
