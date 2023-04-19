import java.util.Iterator;
import java.util.LinkedList;

import models.veggies.Lettuce;

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