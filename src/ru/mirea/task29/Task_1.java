package ru.mirea.task29;

import java.util.Scanner;

public class Task_1
{
	public static void main(String[] args)
	{
		Task_1 obj = new Task_1();
		obj.solve();
	}

	public void solve()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int ans = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				ans += sc.nextInt();
			}
		}

		System.out.println(ans / 2);
	}
}
