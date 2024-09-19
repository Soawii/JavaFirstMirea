package ru.mirea.task9;

import java.util.Arrays;
import java.util.Random;

public class Test
{
	public static void InsertionSort(Comparable[] arr)
	{
		for (int i = 1; i < arr.length; i++)
		{
			for (int j = i - 1; j >= 0; j--)
			{
				if (arr[j].compareTo(arr[j + 1]) > 0)
				{
					Comparable temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				else break;
			}
		}
	}

	public static void main(String[] args)
	{
		Student[] students = new Student[10];
		Random r = new Random();

		for (int i = 0; i < 10; i++)
		{
			students[i] = new Student(r.nextInt(1000), "abc", r.nextDouble() * 4);
		}

		System.out.println(Arrays.toString(students));
		InsertionSort(students);
		System.out.println(Arrays.toString(students));
	}
}
