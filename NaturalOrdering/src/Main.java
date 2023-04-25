import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import models.Person;

public class Main 
{

	public static void main(String[] args) 
	{
		//
		List<Person> list = new ArrayList<Person>();
		addElements(list);
		
		showElements(list);
		
		System.out.println("Now for a Tree Set.");
		
		//
		SortedSet<Person> set = new TreeSet<Person>();
		addElements(set);
		
		showElements(set);

	}
	
	//In case of uncertainty whether a List or a Set will be parsed into a method,
	//use the Interface class "Collection"  which is a super interface of both.
	public static void addElements(Collection<Person> col)
	{
		col.add(new Person("Mavin"));
		col.add(new Person("Elvin"));
		col.add(new Person("Bonga"));
		col.add(new Person("Olwethu"));
	}
	
	public static void showElements(Collection<Person> col)
	{
		for(Person person: col)
		{
			System.out.println("Peron named: "+person);
		}
	}
}
