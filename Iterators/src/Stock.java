import java.util.Iterator;
import java.util.LinkedList;

import models.fruits.Banana;

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
			return linkedlist.iterator();
		}
	}