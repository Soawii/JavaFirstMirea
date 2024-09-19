package ru.mirea.task21;

import java.util.ArrayList;

public class Task_1
{
	public static <E> ArrayList<E> convertToList(E[] arr)
	{
		ArrayList<E> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
		{
			list.add(arr[i]);
		}
		return list;
	}

	public static void main(String[] args)
	{
		Integer[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(convertToList(arr));

		String[] s_arr = {"a", "b", "c", "d"};
		System.out.println(convertToList(s_arr));
	}
}
