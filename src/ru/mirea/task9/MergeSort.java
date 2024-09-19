package ru.mirea.task9;

import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class MergeSort
{
	public static void MergeSort(Comparable[] arr, int l, int r)
	{
		if (l >= r) return;
		int mid = (l + r) / 2;

		MergeSort(arr, l, mid);
		MergeSort(arr, mid + 1, r);

		int l_idx = l, r_idx = mid + 1;
		Comparable[] new_arr = new Comparable[r - l + 1];
		int idx = 0;
		while (l_idx <= mid || r_idx <= r)
		{
			if (l_idx <= mid && r_idx <= r) new_arr[idx++] = arr[l_idx].compareTo(arr[r_idx]) <= 0 ? arr[l_idx++] : arr[r_idx++];
			else if (l_idx <= mid) new_arr[idx++] = arr[l_idx++];
			else new_arr[idx++] = arr[r_idx++];
		}
		for (int i = 0; i < new_arr.length; i++) arr[l + i] = new_arr[i];
		return;
	}
	public static void main(String[] args)
	{
		Student[] students1 = new Student[10], students2 = new Student[10];
		Random r = new Random();

		for (int i = 0; i < 10; i++)
		{
			students1[i] = new Student(r.nextInt(1000), "abc", r.nextDouble() * 4);
			students2[i] = new Student(r.nextInt(1000), "abc", r.nextDouble() * 4);
		}

		System.out.println(Arrays.toString(students1));
		System.out.println(Arrays.toString(students2));

		MergeSort.MergeSort(students1, 0, students1.length - 1);
		MergeSort.MergeSort(students2, 0, students2.length - 1);

		Student[] new_arr = new Student[students1.length + students2.length];
		int l_idx = 0, r_idx = 0, idx = 0;
		while (l_idx < 10 || r_idx < 10)
		{
			if (l_idx < 10 && r_idx < 10) new_arr[idx++] = students1[l_idx].compareTo(students2[r_idx]) <= 0 ? students1[l_idx++] : students2[r_idx++];
			else if (l_idx < 10) new_arr[idx++] = students1[l_idx++];
			else new_arr[idx++] = students2[r_idx++];
		}

		System.out.println(Arrays.toString(new_arr));
	}
}
