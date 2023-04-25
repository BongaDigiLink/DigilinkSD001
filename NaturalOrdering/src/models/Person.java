package models;

import java.util.Objects;

public class Person implements Comparable<Person>
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}

	@Override
	public int compareTo(Person person) 
	{
		//return name.compareTo(person.name);
		
		//Sorting based on the length of the string.
		int len2 = person.name.length();
		int len1 = name.length();
		
		if(len1 > len2)
		{
			return 1;
		}
		
		if(len2 > len1)
		{
			return -1;
		}
		
		return 0;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
}
