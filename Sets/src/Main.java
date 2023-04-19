import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Doesnt retain order of ojects
//		Set<String> set1 = new HashSet<String>();
		
//		Set<String> set1 = new LinkedHashSet<String>();
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Inja");
		set1.add("Veggies");
		set1.add("groceries");
		
		System.out.println(set1);

	}

}
