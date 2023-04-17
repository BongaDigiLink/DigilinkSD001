import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		//Create numbers, a var that will hold the address of the object reference.
		List<Integer> numbers = new ArrayList<Integer>();
		
		//Adding numbers to the list.
		numbers.add(12);
		numbers.add(1);
		numbers.add(152);
		numbers.add(9);
		
		System.out.println("List numbers are :");
		for( int i = 0; i < numbers.size() ; i++)
		{
			System.out.println("#"+i +" " +numbers.get(i));
		}
		
		//Deleting a number for the array list.
		//time consuming, may take long in the case. There are millions of
		//records
		int deletedNum = numbers.remove(1);
		//removing the second index.
		System.out.println("The deleted number is: "+ deletedNum);
		
		//Check the changed array list now.
		System.out.println("The new decremented numbers are :");
		for( int i = 0; i < numbers.size(); i++)
		{
			System.out.println("#"+i+" "+numbers.get(i));
		}

	}
}
