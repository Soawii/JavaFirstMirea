package ru.mirea.task20.Task_4;

public class MinMax<T extends Comparable<T>>
{
	T[] arr;

	public MinMax(T[] arr)
	{
		this.arr = arr;
	}

	public T getMin()
	{
		T min = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (min.compareTo(arr[i]) > 0)
			{
				min = arr[i];
			}
		}
		return min;
	}

	public T getMax()
	{
		T max = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (max.compareTo(arr[i]) < 0)
			{
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		Integer[] arr = {1, 2, 3, 4, 5, -1, -2, 10};
		MinMax<Integer> minmax = new MinMax<>(arr);
		System.out.println(minmax.getMin() + " " + minmax.getMax());
	}
}
