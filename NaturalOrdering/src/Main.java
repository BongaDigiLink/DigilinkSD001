import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		//the person doesnot have a natural order. hence at first it is not possible to 
		//call the sort method.
		Collections.sort(list);
		
		System.out.println("------------Now for a Tree Set.--------------");
		
		//Elements stored in natural order. automatically sorted
		SortedSet<Person> set = new TreeSet<Person>();
		//Class cast exception: not possible to add elements in a tree set without
		//first defining a natural order.
		addElements(set);
		
		showElements(set);
	}
	
	//In case of uncertainty whether a List or a Set will be parsed into a method,
	//use the Interface class "Collection"  which is a super interface of both(list and set).
	//A collection interface is perfect for only adding and removing.
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
