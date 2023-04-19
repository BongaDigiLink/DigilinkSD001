import java.util.Iterator;
import java.util.LinkedList;

import models.fruits.Banana;
import models.veggies.Lettuce;

public class Main {

	public static void main(String[] args) 
	{
		
		
		//Create iterable list objects.
		
	}
	
	
	public class Stock implements Iterable<Banana>
	{
		private int index = 0;
		private LinkedList<Banana> linkedlist = new LinkedList<Banana>();
		
		public Stock() 
		{
			linkedlist.add(new Banana(1, "Moie River"));
			linkedlist.add(new Banana(1, "Glen Fisher"));
			linkedlist.add(new Banana(2, "Supa Save"));
			linkedlist.add(new Banana(2, "Moie River"));
//			this.index = linkedlist.size();
		}
		
		private class StockIterator implements Iterator<Banana> 
		{

			@Override
			public boolean hasNext() 
			{
				// TODO Auto-generated method stub
				return (index < linkedlist.size());
			}

			@Override
			public Banana next() 
			{
				// TODO Auto-generated method stub
				Banana banana = linkedlist.get(index);
				index++;
				return banana;
			}
			
		}
		
		@Override
		public Iterator<Banana> iterator() 
		{
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public class VeggieStock implements Iterable<Lettuce>
	{
		private LinkedList<Lettuce> veggies = new LinkedList<Lettuce>();
		private int index = 0;
		
		public VeggieStock() 
		{
			veggies.add(new Lettuce(3, "Supa Save"));
			veggies.add(new Lettuce(1, "Supa Save"));
			veggies.add(new Lettuce(2, "Glen Fisher"));
//			this.index = veggies.size();
		}
		
		
		private class VeggieIterator implements Iterator<Lettuce>
		{

			@Override
			public boolean hasNext() 
			{
				// TODO Auto-generated method stub
				return (index < veggies.size());
			}

			@Override
			public Lettuce next() 
			{
				Lettuce lettuce = veggies.get(index);
				index++;
				return lettuce;
			}
			
		}

		@Override
		public Iterator<Lettuce> iterator() 
		{
			// TODO Auto-generated method stub
			return veggies.iterator();
		}
		
	}

}
