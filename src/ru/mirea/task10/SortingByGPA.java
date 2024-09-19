package ru.mirea.task10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortingByGPA
{
	public void setArray(Student[] array, int n)
	{
		Random r = new Random();
		for (int i = 0; i < n; i++)
		{
			array[i] = new Student("first", "last", "programming", "abc", 2, r.nextInt(100), r.nextDouble() * 5);
		}
	}

	public Comparator<Student> comparator_GPA()
	{
		return new Comparator<Student>()
		{
			@Override
			public int compare(Student s1, Student s2)
			{
				return s1.getGPA() == s2.getGPA() ? 0 : s1.getGPA() > s2.getGPA() ? -1 : 1;
			}
		};
	}

	public Comparator<Student> comparator_ID()
	{
		return new Comparator<Student>()
		{
			@Override
			public int compare(Student s1, Student s2)
			{
				return s1.getID() == s2.getID() ? 0 : s1.getID() > s2.getID() ? 1 : -1;
			}
		};
	}

	public void QuickSort(Student[] args, Comparator<Student> c)
	{
		QuickSortHelper(args, c, 0, args.length - 1);
	}

	public void QuickSortHelper(Student[] args, Comparator<Student> c, int l, int r)
	{
		if (l >= r) return;

		int mid = (l + r) / 2;
		Student pivot = args[mid];

		args[mid] = args[r];
		args[r] = pivot;

		int idx = l;
		for (int i = l; i <= r; i++)
		{
			if (c.compare(args[i], pivot) < 0)
			{
				Student temp = args[i];
				args[i] = args[idx];
				args[idx] = temp;
				idx++;
			}
		}

		args[r] = args[idx];
		args[idx] = pivot;

		QuickSortHelper(args, c, l, idx - 1);
		QuickSortHelper(args, c, idx + 1, r);
	}

	public static void main(String[] args)
	{
		SortingByGPA sorting = new SortingByGPA();
		int n = 10;
		Student[] arr =  new Student[n];
		sorting.setArray(arr, n);

		System.out.println(Arrays.toString(arr));
		sorting.QuickSort(arr, sorting.comparator_GPA());
		System.out.println(Arrays.toString(arr));

		sorting.QuickSort(arr, sorting.comparator_ID());
		System.out.println(Arrays.toString(arr));
	}
}
