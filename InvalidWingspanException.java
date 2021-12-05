
public class InvalidWingspanException extends RuntimeException
{
	public InvalidWingspanException(String exception) 
	{
		super(exception+" is an invalid wingspan");
	}
}//end class
