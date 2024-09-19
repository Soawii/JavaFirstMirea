package ru.mirea.task8;
import java.util.Scanner;

public class Task_9
{
	public static int count_seq(int zeroes, int ones, boolean zero_last, String seq)
	{
		if (zeroes == 0 && ones == 0)
		{
			System.out.println(seq);
			return 1;
		}
		int ans = 0;
		if (!zero_last && zeroes > 0)
		{
			seq = seq + "0";
			ans += count_seq(zeroes - 1, ones, true, seq);
			seq = seq.substring(0, seq.length() - 1);
		}
		if (ones > 0)
		{
			seq = seq + "1";
			ans += count_seq(zeroes, ones - 1, false, seq);
			seq = seq.substring(0, seq.length() - 1);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();

		System.out.println(count_seq(a, b, false, ""));
	}
}
