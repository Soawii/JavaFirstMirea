package ru.mirea.task21;

import java.util.ArrayList;

public class Task_2 <E>
{
	E[] data;
	int size = 0;

	public Task_2(E[] arr)
	{
		data = arr;
		size = data.length;
	}

	public void add(E elem)
	{
		if (size == data.length)
		{
			E[] newData = (E[])new Object[data.length * 2];
			System.arraycopy(data, 0, newData, 0, data.length);
			data = newData;
		}
		data[size++] = elem;
	}

	public void print()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.println(data[i]);
		}
	}

	public E get_idx(int idx)
	{
		if (idx > size)
			throw new ArrayIndexOutOfBoundsException("" + idx + " is out of bounds, size of array: " + size);
		return data[idx];
	}

	public ArrayList<E> getList()
	{
		ArrayList<E> list = new ArrayList<E>();
		for (int i = 0; i < size; i++)
		{
			list.add(data[i]);
		}
		for (int i = 0; i < Math.min(5, list.size()); i++)
		{
			System.out.print("" + list.get(i) + " ");
		}
		return list;
	}

	public static void main(String[] args)
	{
		Task_2<Integer> t = new Task_2<Integer>(new Integer[]{1, 2, 3, 5, 6});
		t.print();

		Task_2<String> a = new Task_2<String>(new String[]{"1", "2", "3", "5", "6aa"});
		a.print();

		a.getList();
	}
}
