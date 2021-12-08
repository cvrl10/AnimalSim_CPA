
/**
 * This is a subclass of Animal, represents a Goldfinch object
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class Goldfinch extends Animal implements Walkable, Flyable
{
	private double wingSpan;//floating point number between 5.0 and 11.0
	
	/**
	 * The empty-argument constructor calls super(), sets wingSpan = 9.0
	 */
	public Goldfinch()
	{
		super();
		setWingSpan(9);
	}//end empty-argument constructor
	
	/**
	 * @param simID the data passed into the constructor
	 * @param l the Location passes into the constructor
	 * @param wingSpan the data passed into the constructor
	 * sets full = false and rested = true
	 */
	public Goldfinch(int simID, Location l, double wingSpan)
	{
		super(simID, l);
		setWingSpan(wingSpan);	
	}//end preferred constructor
	
	/**
	 * @return wingSpan
	 */
	public double getWingSpan() 
	{
		return wingSpan;
	}//getWingSpan
	
	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan)
	{
		try
		{
			if (wingSpan < 5.0 || wingSpan > 11.0)
				throw new InvalidWingspanException(""+wingSpan);
			this.wingSpan = wingSpan;
		}
		catch(InvalidWingspanException exception)
		{
			System.out.println(exception.getMessage());
		}
	}//end setWingSpan
	
	/**
	 * @return a String of information about the object
	 */
	@Override
	public String toString()
	{
		int[] coordinates = location.getCoordinates();
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=(" + coordinates[0]+","+coordinates[1] + "), full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
	/**
	 * update the Location of this object
	 */
	@Override
	public void fly(Location l) 
	{
		setLocation(l);
	}//end fly
	
	/**
	 * update the Location object
	 */
	@Override
	public void walk(int direction) //1 unit
	{
		int[] coordinates = location.getCoordinates();
		if (direction <= 0)
			location.update(coordinates[0]-1, coordinates[1]); 
		if (direction == 1)
			location.update(coordinates[0], coordinates[1]+1); 
		if (direction == 2)
			location.update(coordinates[0], coordinates[1]-1); 
		if (direction >=3)
			location.update(coordinates[0]+1, coordinates[1]); 
	}//end walk
}//end class
