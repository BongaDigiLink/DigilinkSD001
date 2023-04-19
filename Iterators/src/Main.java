import java.util.Iterator;

import models.fruits.Banana;
import models.veggies.Lettuce;

public class Main {

	public static void main(String[] args) 
	{
		//Objects to add to lists
		Banana banana = new Banana(1, "Moie River");
		Banana banana1 = new Banana(2, "Supa Save");
		Banana banana2 = new Banana(1, "Glen Fisher");
		Banana banana3 = new Banana(2, "Moie River");
		
		Lettuce lettuce = new Lettuce(3, "Supa Save");
		Lettuce lettuce1 = new Lettuce(1, "Supa Save");
		Lettuce lettuce2 = new Lettuce(2, "Glen Fisher");
		
		
		//Create iterable list objects.
		
	}
	
	
	public class Stock implements Iterable<Banana>
	{
		
		public class Iterator implements iterator<String>
		{
			
		}

		@Override
		public Iterator<String> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public class VeggieStock implements Iterable<Lettuce>
	{

		@Override
		public Iterator<Lettuce> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
