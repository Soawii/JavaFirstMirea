package ru.mirea.task26.Task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator<T> implements Iterable<T>
{
	private final List<T> list;

	public ListIterator(List<T> list)
	{
		this.list = list;
	}

	private class ListIteratorImpl implements Iterator<T>
	{
		private int pointer = 0;

		@Override
		public boolean hasNext()
		{
			return pointer < list.size();
		}

		@Override
		public T next()
		{
			return list.get(pointer++);
		}
	}

	@Override
	public Iterator<T> iterator()
	{
		return new ListIteratorImpl();
	}

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		ListIterator<String> listIterator = new ListIterator<String>(list);
		for (String s : listIterator)
		{
			System.out.println(s);
		}
	}
}
