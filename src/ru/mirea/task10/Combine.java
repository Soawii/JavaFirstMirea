package ru.mirea.task10;

import java.util.Arrays;
import java.util.Comparator;

public class Combine
{
	public static Student[] merge(Student[] l, Student[] r, Comparator<Student> c)
	{
		Student[] merged = new Student[l.length + r.length];
		int l_idx = 0, r_idx = 0, idx = 0;
		while (l_idx < l.length && r_idx < r.length)
			merged[idx++] = c.compare(l[l_idx], r[r_idx]) <= 0 ? l[l_idx++] : r[r_idx++];
		while (l_idx < l.length)
			merged[idx++] = l[l_idx++];
		while (r_idx < r.length)
			merged[idx++] = r[r_idx++];
		return merged;
	}
	public static void main(String[] args)
	{
		SortingByGPA s = new SortingByGPA();
		int n = 10;
		Student[] l =  new Student[n], r = new Student[n];
		s.setArray(l, n);
		s.setArray(r, n);

		s.QuickSort(l, s.comparator_GPA());
		s.QuickSort(r, s.comparator_GPA());
		Student[] merged_by_gpa = merge(l, r, s.comparator_GPA());

		s.QuickSort(l, s.comparator_ID());
		s.QuickSort(r, s.comparator_ID());
		Student[] merged_by_id = merge(l, r, s.comparator_ID());

		System.out.println("Merged by GPA: " + Arrays.toString(merged_by_gpa));
		System.out.println("Merged by ID: " + Arrays.toString(merged_by_id));
	}
}
