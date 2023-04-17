import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		//Create two object instnce of arrayL and LinkedList
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();
		
		addToList("Array ", array);
		
		addToList("LinkedList ", linkedlist);
		
		addToPosition("Array ", 3, array);
		
		addToPosition("LinkedList ", 3, array);
	}
	
	//create a method that will make timings
	//parse in a String to describe what ypu area parsing in and the
	//list parsed as a second parameter
	private static void doTimings(String type, List list)
	{
		
	}
	
	//Add to lists.
	private static void addToList(String type, List<Integer> array)
	{
		long start = System.currentTimeMillis();
		//Adding numbers to an array.

		//Add a fixed numbers to these lists.
		for( int i = 0; i < 39; i++ )
		{
			//Adding to array
			array.add(i);
			System.out.print(" "+array.indexOf(i));

		}
		long end = System.currentTimeMillis();
		
		System.out.println("");
		System.out.println("Time taken to add to list: "+type +" "+ (end-start) + "ms.");
		System.out.println("");
	}
	
	private static void addToPosition(String type, int index, List<Integer> list)
	{
		long start = System.currentTimeMillis();
		//add 12 at index.
		list.add(index, 12);
		for( int i = 0; i < list.size(); i++ )
		{
			//Adding to array
			System.out.print(" "+list.indexOf(i));
		}
		
		long end = System.currentTimeMillis();
		System.out.println("");
		System.out.println("Time taken to add to an index: "+type +" "+ (end-start) + "ms.");
	}
}
