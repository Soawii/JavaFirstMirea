package ru.mirea.task26;

import java.util.Arrays;
import java.util.Stack;

public class Task_1
{
	public static void main(String[] args)
	{
		Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++)
			stack.push(arr[i]);


		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = stack.pop();
		}
		System.out.println(Arrays.toString(arr));
	}
}
