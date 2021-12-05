
public class InvalidCoordinateException extends RuntimeException
{
	public InvalidCoordinateException(String exception)
	{
		super(exception+" are invalid coordinates");
	}//end preferred constructor
}//end class