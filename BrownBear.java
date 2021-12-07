
/**
 * This is a subclass of Animal, represents a BrownBear object
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class BrownBear extends Animal implements Walkable, Swimmable 
{
	private String subSpecies;//the subspecies of this object
	
	/**
	 * The empty-argument constructor sets simID = 0, calls the empty-argument constructor of Location, sets full = true, sets rested = true and sets subSpecies = Alaskan
	 */
	public BrownBear()
	{
		super();
		setSubSpecies("Alaskan");
	}//end empty-argument constructor
	
	/**
	 * 
	 * @param simID the data passed into the constructor
	 * @param l the location passed into the constructor
	 * @param subSpecies the subSpecies passed into the constructor
	 */
	public BrownBear(int simID, Location l, String subSpecies)
	{
		super(simID, l);
		setSubSpecies(subSpecies);
	}//end preferred constructor
	
	/**
	 * @return subSpecies
	 */
	public String getSubSpecies() 
	{
		return subSpecies;
	}//end getSubSpecies
	
	/**
	 * @param subSpecies the subSpecies to set
	 */
	public void setSubSpecies(String subSpecies) 
	{
		try
		{
			if (subSpecies == null)
				throw new InvalidSubspeciesException(subSpecies);	
			switch (subSpecies)
			{
			case "Alaskan":
				this.subSpecies = subSpecies;
				break;
			case "Asiatic":
				this.subSpecies = subSpecies;
				break;
			case "European":
				this.subSpecies = subSpecies;
				break;
			case "Grizzly":
				this.subSpecies = subSpecies;
				break;
			case "Kodiak":
				this.subSpecies = subSpecies;
				break;
			case "Siberian":
				this.subSpecies = subSpecies;
				break;
			default:
				throw new InvalidSubspeciesException(subSpecies);
			}
		}
		catch (InvalidSubspeciesException exception)
		{
			System.out.println(exception.getMessage());
		}
	}//end setSubSpecies
	
	/**
	 * update the Location object
	 */
	@Override
	public void walk(int direction)//3 units
	{
		int[] coordinates = location.getCoordinates();
		if (direction <= 0)
			location.update(coordinates[0]-3, coordinates[1]); 
		if (direction == 1)
			location.update(coordinates[0], coordinates[1]+3); 
		if (direction == 2)
			location.update(coordinates[0], coordinates[1]-3); 
		if (direction >=3)
			location.update(coordinates[0]+3, coordinates[1]); 
	}//end walk
	
	/**
	 * @return a String of information about the object
	 */
	@Override
	public String toString() 
	{
		return "BrownBear [subSpecies=" + subSpecies + "]";
	}//end toString
	
	/**
	 * update the Location object
	 */
	@Override
	public void swim(int direction)//2 units
	{
		int[] coordinates = location.getCoordinates();
		if (direction <= 0)
			location.update(coordinates[0]-2, coordinates[1]); 
		if (direction == 1)
			location.update(coordinates[0], coordinates[1]+2); 
		if (direction == 2)
			location.update(coordinates[0], coordinates[1]-2); 
		if (direction >=3)
			location.update(coordinates[0]+2, coordinates[1]); 
	}//end swim	
}//end class
