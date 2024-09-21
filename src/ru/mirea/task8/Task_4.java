package ru.mirea.task8;
import java.util.Scanner;

public class Task_4
{
	public static int recursion(int k, int s, String number, boolean start)
	{
		if (s < 0) return 0;
		if (k == 0)
		{
			if (s == 0)
			{
				System.out.println(number);
				return 1;
			}
			return 0;
		}

		int ans = 0;
		for (int i = 0; i <= 9; i++)
		{
			if (start && i == 0) continue;
			number += i;
			ans += recursion(k - 1, s - i, number, false);
			number = number.substring(0, number.length() - 1);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int k, s;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter k: ");
			k = sc.nextInt();
			System.out.println("Enter s: ");
			s = sc.nextInt();
		}
		catch (Exception e)
		{
			System.out.println(e);
			return;
		}



		System.out.println(recursion(k, s, "", true));
	}
}
