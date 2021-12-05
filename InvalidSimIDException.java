
public class InvalidSimIDException extends RuntimeException
{
	public InvalidSimIDException(String exception)
	{
		super(exception+" is an invalid sim ID");
	}//end preferred constructor
}//end class
