
public class InvalidSubspeciesException extends RuntimeException
{
	public InvalidSubspeciesException(String exception)
	{
		super(exception+" is an invalid subspecies");
	}
}//end class
