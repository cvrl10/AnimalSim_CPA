
public class Goldfinch extends Animal implements Walkable, Flyable
{
	private double wingSpan;
	public Goldfinch()
	{
		super();
		setWingSpan(9);
	}//end empty-argument constructor
	public Goldfinch(int simID, Location l, double wingSpan)
	{
		super(simID, l);
		setWingSpan(wingSpan);	
	}//end preferred constructor
	public double getWingSpan() 
	{
		return wingSpan;
	}//getWingSpan
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
	@Override
	public String toString() 
	{
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//toString
	@Override
	public void fly(Location l) 
	{
		location = l;
	}//end fly
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
