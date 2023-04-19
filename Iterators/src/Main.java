import models.fruits.Banana;
import models.veggies.Lettuce;

public class Main {

	public static void main(String[] args) 
	{
		
		
		//Iterate through objects.
		Stock stock = new Stock();
		for( Banana banana : stock )
		{
			System.out.print(banana);
		}
		
		//iterate through all the veggies
		VeggieStock veggies = new VeggieStock();
		for(Lettuce lettuce : veggies) 
		{
			System.out.println(lettuce);
		}
	}
	
}
	
