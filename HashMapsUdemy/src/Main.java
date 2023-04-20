import java.util.HashMap;
import java.util.Map;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Hello");
		map.put(4, "World");
		map.put(14, "Hello World");
		
		//Duplicate keys are not possible.
		//Overriding the string in the preceeding key (4)
		map.put(4, "World");
		
		//Get string by key value.
		String text = map.get(1);
		
		System.out.print("The retrieved string is: " +text);
		
		//Iterate through items
		for( Map.Entry<Integer, String> entry : map.entrySet()) 
		{
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " " + " Value:"+ value);
		}

	}

}
