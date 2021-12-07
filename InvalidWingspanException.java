
/**
 * This class represents a RuntimeException 
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class InvalidWingspanException extends RuntimeException
{
	public InvalidWingspanException(String exception) 
	{
		super(exception+" is an invalid wingspan");
	}
}//end class
