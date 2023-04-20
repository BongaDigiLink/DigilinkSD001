import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.veggies.Veggie;

public class Main {

	public static void main(String[] args) {
		//Instantiation/Referred object by type
		HashMap<Integer, Veggie> hashmap = new HashMap<Integer, Veggie>();
		LinkedHashMap<Integer, Veggie> linkedmap = new LinkedHashMap<Integer, Veggie>();
		TreeMap<Integer, Veggie> treemap = new TreeMap<Integer, Veggie>();

		//Instantiation by Interface Type class - refering to the object.
		//specific Created by type.
		//common map /exact map.
//		Map<Integer, Veggie> hashmap = new HashMap<Veggie, String>();
//		Map<Integer, Veggie> linkedmap = new LinkedHashMap<Integer, Veggie>();
//		Map<Integer, Veggie> treemap = new TreeMap<Integer, Veggie>();

		testMap(hashmap);

	}

	public static void testMap(Map<Integer, Veggie> map) 
	{
		map.put(1, new Veggie(50, "lettuce"));
		map.put(2, new Veggie(459, "cabbage"));
		// Yes Tomato is a fruit :)
		map.put(3, new Veggie(459, "tomato"));
		map.put(31, new Veggie(90, "carrot"));
		map.put(10, new Veggie(12, "pumpkin"));
		map.put(13, new Veggie(48, "beans"));

		for(Integer key :map.keySet())
		{
			Veggie newVeg = map.get(key);
			System.out.print("Key: "+ key);
			
			setDescription(newVeg);
			System.out.println(" Veggie :"+newVeg.getName()+" "+newVeg.getProductDescription());
		}

	}

	private static void setDescription(Veggie veggie) 
	{

		switch (veggie.getName()) 
		{
		case "tomato":
			veggie.setProductDescription("A tomato, from Shoprite");
			break;
		case "lettuce":
			veggie.setProductDescription("Lettuce, burger king filling lettuce");
			break;
		case "pumpkin":
			veggie.setProductDescription("Food lovers market pumpkin. SUpplied local");
			break;
		case "cabbage":
			veggie.setProductDescription("A cabbage, sold at food lovers market.");
			break;
		case "beans":
			veggie.setProductDescription("Koo canned baked beans.");
			break;
			
			default:
				veggie.setProductDescription("A general veggie from a shop.");
		}

	}
}
