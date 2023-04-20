import java.util.HashMap;

import model.veggies.Lettuce;
import model.veggies.Veggie;

public class Main 
{
	//Hashmap do not maintain order.
	//For order use a LinkedHashMap
	
	HashMap<Veggie, String> map = new HashMap<Veggie, String>();
	
	//create veggies
	Veggie lettuce = new Veggie(50,"Lettuce");
	Veggie cabbage = new Veggie(459,"cabbage");
	Veggie tomato = new Veggie(5,"tomato");
	Veggie beans = new Veggie(48,"beans");
	
	//Line 20 producing error. revert back !!!
//	map.put(lettuce, lettuce.getName());
	
	
	//Code along -Code exact as on the udemy tutorial however
	// still producing error. 
	 HashMap<Integer, Lettuce> hashmap = new HashMap<Integer, Lettuce>();
	 hashmap.put(1, new Lettuce(1, "A new name"));
	 
//	 hashmap.put(1, "One");
//	 hashmap.put(3, "three");
//	 hashmap.put(19, "nineteen");
//	 hashmap.put(10, "ten");
	
	//HashMaps are not sorted. Sorting is not reliable.
	
}
