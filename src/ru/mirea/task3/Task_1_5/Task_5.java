package ru.mirea.task3.Task_1_5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_5
{
	public static void main(String[] args)
	{
		int N;
		System.out.print("Enter N: ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		while (N < 10)
		{
			System.out.print("N must be >= 10, Enter N: ");
			N = sc.nextInt();
		}

		int[] arr = new int[N];
		Random r = new Random();
		int even_count = 0;
		for (int i = 0; i < N; i++)
		{
			arr[i] = r.nextInt(0, N + 1);
			even_count += 1 - (arr[i] % 2);
		}
		System.out.println(Arrays.toString(arr));

		if (even_count > 0)
		{
			int[] even_arr = new int[even_count];
			int idx = 0;
			for (int i = 0; i < N; i++)
			{
				if (arr[i] % 2 == 0)
				{
					even_arr[idx++] = arr[i];
				}
			}
			System.out.println(Arrays.toString(even_arr));
		}
	}
}
