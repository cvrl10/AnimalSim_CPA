
/**
 * This class represents a RuntimeException 
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class InvalidSubspeciesException extends RuntimeException
{
	public InvalidSubspeciesException(String exception)
	{
		super(exception+" is an invalid subspecies");
	}//end preferred constructor
}//end class
