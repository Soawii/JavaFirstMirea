package ru.mirea.task9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortingByGPA implements Comparator<Student>
{
	@Override
	public int compare(Student l, Student r)
	{
		return (l.GPA < r.GPA ? 1 : (l.GPA == r.GPA ? 0 : -1));
	}

	public void QuickSort(Student[] args, int l, int r)
	{
		if (l >= r) return;

		int mid = (l + r) / 2;
		Student pivot = args[mid];

		args[mid] = args[r];
		args[r] = pivot;

		int idx = l;
		for (int i = l; i <= r; i++)
		{
			if (compare(args[i], pivot) < 0)
			{
				Student temp = args[i];
				args[i] = args[idx];
				args[idx] = temp;
				idx++;
			}
		}

		args[r] = args[idx];
		args[idx] = pivot;

		QuickSort(args, l, idx - 1);
		QuickSort(args, idx + 1, r);
	}

	public static void main(String[] args)
	{
		Student[] students = new Student[10];
		Random r = new Random();

		for (int i = 0; i < 10; i++)
		{
			students[i] = new Student(r.nextInt(1000), "abc", r.nextDouble() * 4);
		}

		SortingByGPA s = new SortingByGPA();

		System.out.println(Arrays.toString(students));
		s.QuickSort(students, 0, students.length - 1);
		System.out.println(Arrays.toString(students));
	}
}
