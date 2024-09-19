package ru.mirea.task26;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

class MyList<T>
{
	private Object[] arr = new Object[10];
	int n = 0;

	public MyList(int n, T elem)
	{
		arr = new Object[n];
		for (int i = 0; i < n; i++)
			arr[i] = elem;
		this.n = n;
	}

	public T at(int n)
	{
		return (T)arr[n];
	}

	public void checkForSpace()
	{
		if (n == arr.length)
		{
			Object[] temp = new Object[arr.length * 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
	}

	public void add(T elem)
	{
		checkForSpace();
		arr[n++] = elem;
	}

	public void pop()
	{
		if (n == 0)
			throw new NoSuchElementException();
		arr[--n] = null;
	}
}

class MyListIterable<T> implements Iterable<T>
{
	MyList<T> list;
	public MyListIterable(MyList<T> list)
	{
		this.list = list;
	}

	@Override
	public Iterator<T> iterator()
	{
		return new MyListIterator();
	}

	@Override
	public void forEach(Consumer<? super T> action)
	{
		Iterable.super.forEach(action);
	}

	private class MyListIterator implements Iterator<T>
	{
		int current = 0;

		@Override
		public boolean hasNext()
		{
			return current < list.n;
		}

		@Override
		public T next()
		{
			return list.at(current++);
		}
	}

}

public class Task_3
{
	public static void main(String[] args)
	{
		MyList<Integer> my_list = new MyList<>(5, 5);
		my_list.add(1);
		my_list.add(2);
		my_list.add(3);

		MyListIterable<Integer> i = new MyListIterable<>(my_list);
		Iterator<Integer> it = i.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}