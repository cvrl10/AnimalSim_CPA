
public abstract class Animal 
{
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	public Animal()
	{
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
	}//end empty-argument constructor
	public Animal(int simID, Location l)
	{
		setSimID(simID);
		location = l;
		full = false;
		rested = true;
	}//end preferred constructor
	public boolean eat()
	{
		Double num = Math.random();	
		if (num <= 0.5)
			full = false;
		else 
			full = true;
		return full;
	}//end eat
	public boolean sleep()
	{
		Double num = Math.random();	
		if (num <= 0.5)
			rested = false;
		else 
			rested = true;
		return rested;
	}//end sleep
	public int getSimID() 
	{
		return simID;
	}//end getSimID
	public void setSimID(int simID) 
	{
		try
		{
			if (simID <= 0)
				throw new InvalidSimIDException(""+simID);
			this.simID = simID;
		}
		catch (InvalidSimIDException exception)
		{
			System.out.println(exception.getMessage());
		}		
	}//end setSimID
	public Location getLocation() 
	{
		return location;
	}//end getLocation
	public void setLocation(Location location) 
	{
		this.location = location;
	}//end setLocation
	public boolean isFull() 
	{
		return full;
	}//end isFull
	public void setFull(boolean full) 
	{
		this.full = full;
	}//end setFull
	public boolean isRested() 
	{
		return rested;
	}//end isRested
	public void setRested(boolean rested) 
	{
		this.rested = rested;
	}//end setRested
}//end abstract class
