
/**
 * This class encapsulates a generic animal that can be sub-classed by other classes.
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public abstract class Animal 
{
	protected int simID;//an integer greater than zero
	protected Location location;//Location object that encapsulates the animal's x and y coordinates in the simulation world
	protected boolean full;//indicates that an animal is full after it has eaten
	protected boolean rested;//indicates that an animal is rested after it sleeps
	
	/**
	 * The empty-argument constructor sets simID to zero, calls the empty-argument constructor of Location, sets full = false and rested = true
	 */
	public Animal()
	{
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
	}//end empty-argument constructor
	
	/**
	 * @param simID the data passed into the constructor
	 * @param l the Location passed into the constructor
	 * sets full = false and rested = true
	 */
	public Animal(int simID, Location l)
	{
		setSimID(simID);
		location = l;
		full = false;
		rested = true;
	}//end preferred constructor
	
	/**
	 * This generates a random number between 0 and 1. If the number is 0.5 or lower, sets full = false; otherwise, sets full = true.
	 * @return full
	 */
	public boolean eat()
	{
		Double num = Math.random();	
		if (num <= 0.5)
			full = false;
		else 
			full = true;
		return full;
	}//end eat
	
	/**
	 * This generates a random number between 0 and 1. If the number is 0.5 or lower, sets rested = false; otherwise, sets rested = true.
	 * @return rested
	 */
	public boolean sleep()
	{
		Double num = Math.random();	
		if (num <= 0.5)
			rested = false;
		else 
			rested = true;
		return rested;
	}//end sleep
	
	/**
	 * @return simID
	 */
	public int getSimID() 
	{
		return simID;
	}//end getSimID
	
	/**
	 * @param simID the simID to set
	 */
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
	
	/**
	 * @return Location the Location of this object
	 */
	public Location getLocation() 
	{
		return location;
	}//end getLocation
	
	/**
	 * @param location the Location to set
	 */
	public void setLocation(Location location) 
	{
		this.location = location;
	}//end setLocation
	
	/**
	 * @return full
	 */
	public boolean isFull() 
	{
		return full;
	}//end isFull
	
	/**
	 * @param full the boolean value to set full
	 */
	public void setFull(boolean full) 
	{
		this.full = full;
	}//end setFull
	
	/**
	 * @return rested
	 */
	public boolean isRested() 
	{
		return rested;
	}//end isRested
	
	/**
	 * @param rested the boolean value to set rested
	 */
	public void setRested(boolean rested) 
	{
		this.rested = rested;
	}//end setRested
}//end abstract class
