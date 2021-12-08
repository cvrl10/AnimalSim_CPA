import java.util.ArrayList;

/**
 * This class tests all the objects of this package
 * 
 * @author carla
 * @version 1.0
 * Final Project
 * Fall 2021
 */
public class Application 
{
	public static void main(String[] args) 
	{
		/**********************************
			Location Tests
		**********************************/
		
		//Instantiating a Location using the empty-argument constructor.
		Location location = new Location();
		
		//Evoking getCoordinates() and assigning it to an array of int.
		int[] coordinates;
		
		//using a for each loop print the coordinates.
		for (int numbers : location.getCoordinates())
			System.out.print(numbers+" ");
		System.out.println();
		
		//Evoking update(int x, int y) and setting x to -10, this call to update throws an InvalidCoordinateException exception that is caught and handled.
		location.update(-10, 10);
		
		//Printing the coordinates to show that the coordinates were not updated since an exception was thrown
		coordinates = location.getCoordinates();
		System.out.println("The x-coordinate is "+coordinates[0]+" and the y-coordinate is "+coordinates[1]+".");
		
		//Instantiating a Location using the preferred constructor and the setting the coordinates to (10,9)
		location = new Location(10, 9);
		coordinates = location.getCoordinates();
		System.out.println("The x-coordinate and y-coordinate of this new Location is ("+coordinates[0]+","+coordinates[1]+")");
		System.out.println();
		
		/**********************************
			Animal Tests
		**********************************/
		//Attempting to instantiate the abstract class Animal, if I were to remove the comments from the code below the compiler will throw an error.
		//Animal creature = new Animal();
	
		//Instantiating  an array of animal references and initializing those references with the empty-argument constructor of the Goldfinch & BrownBear class.
		Animal[] animal = {new Goldfinch(), new BrownBear()};//empty-argument constructors for both Goldfinch and BrownBear
		
		/**********************************
			Goldfinch Tests
		**********************************/
		Goldfinch gold = (Goldfinch)animal[0];
		
		//Evoking toString to test the instance variables from the empty-argument constructor. 
		System.out.println(gold.toString());
		
		//Evoking setLocation 
		gold.setLocation(location);
		
		//Evoking the preferred constructor
		gold = new Goldfinch(79, location, 10);
		
		//Evoking fly and setting this new Location to (1,1).
		gold.fly(new Location(5, 5));
		coordinates = gold.getLocation().getCoordinates();
		System.out.println("The x-coordinate and y-coordinate of this new Location after flying is ("+coordinates[0]+","+coordinates[1]+")");
		System.out.println();
		
		//Evoking isFull
		System.out.println("Is the object full: "+gold.isFull());
		
		//Evoking setFull
		gold.setFull(true);
		System.out.println("Is the object full: "+gold.isFull());
		
		//Evoking isRested
		System.out.println("Is the object rested: "+gold.isRested());
		
		//Evoking setRested
		gold.setRested(false);
		System.out.println("Is the object rested: "+gold.isRested());
		System.out.println();
		
		//Evoking walk, and using a for loop to walk to a new direction with each iteration
		int[] walk = {0, 1, 2, 3};//putting the int directions into an array of int
		for (int i = 0; i < 4; i++)
		{
			gold.walk(walk[i]);
			coordinates = gold.getLocation().getCoordinates();
			System.out.println("The x-coordinate and y-coordinate of this new Location after walking is ("+coordinates[0]+","+coordinates[1]+")");
		}
		
		//Evoking setWingSpan and setSimID, both of these calls throws exception that are handled
		System.out.println();
		System.out.println("Below are the messages that are printed when the exceptions are thrown:");
		gold.setWingSpan(13);
		gold.setSimID(0);
		System.out.println();
		
		//Evoking setWingSpan and setSimID with calls that won't throw exceptions
		gold.setWingSpan(11);
		gold.setSimID(1);
		System.out.println("What's the simID and wingspan of this object: "+gold.getSimID()+" and "+gold.getWingSpan());
		System.out.println();
		
		//Evoking getWingSpan
		System.out.println("What's the wingspan of this object: "+gold.getWingSpan());
		
		//Evoking eat and sleep and checking to see if this object is rested and full
		gold.eat();
		gold.sleep();
		System.out.println("Is this object rested and full: "+gold.isRested()+", "+gold.isFull());
		System.out.println();
		
		/**********************************
			BrownBear Tests
		**********************************/
		BrownBear bear = (BrownBear)animal[1];
		
		//Evoking toString to test the instance variables from the empty-argument constructor. 
		System.out.println(bear.toString());
		
		//Evoking the preferred constructor
		bear = new BrownBear(1, location, "Kodiak");
		
		//Evoking getSubSpecies
		System.out.println(bear.getSubSpecies());

		//Evoking setSubSpecies, this call throws an exception that is handled
		bear.setSubSpecies("Kamchatka");
		System.out.println();
		//Evoking setLocation and using walk and swim to move object to new location
		bear.setLocation(new Location(20, 20));
		
		for (int i = 0; i < 4; i++)
		{
			bear.walk(walk[i]);
			coordinates = bear.getLocation().getCoordinates();
			System.out.println("The x-coordinate and y-coordinate of this new Location after walking is ("+coordinates[0]+","+coordinates[1]+")");
		}
		
		System.out.println();
		int[] swim = walk;
		for (int i = 0; i < 4; i++)
		{
			bear.swim(swim[i]);
			coordinates = bear.getLocation().getCoordinates();
			System.out.println("The x-coordinate and y-coordinate of this new Location after swimming is ("+coordinates[0]+","+coordinates[1]+")");
		}
		
		System.out.println();
		//Evoking eat and sleep and checking to see if this object is rested and full
		bear.eat();
		bear.sleep();
		System.out.println("Is this object rested and full: "+bear.isRested()+", "+bear.isFull());
		System.out.println();
		
		//Evoking setRested and setFull
		bear.setRested(false);
		bear.setFull(false);
		
		//Evoking setSimID and getSimID
		bear.setSimID(2021);
		System.out.println("What's the sim ID: "+bear.getSimID());
		
		//Evoking a call to setSimID that throws an exception
		bear.setSimID(0);
		System.out.println();
		
		/**********************************
			Generics Tests
		**********************************/
		ArrayList<Animal> list = new ArrayList<>();
		list.add(gold);
		list.add(bear);
		list.add(new Goldfinch());
		list.add(new BrownBear());
		list.add(animal[0]);
		list.add(animal[1]);
		
		for (Animal animals : list)
			System.out.println(animals.toString());		
	}//end main
}//end class
