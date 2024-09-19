package ru.mirea.task28;

import java.util.HashSet;
import java.util.TreeSet;

public class Task_1
{
	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);

		TreeSet<Integer> treeSet = new TreeSet<>(set);
		System.out.println(treeSet);
	}
}
