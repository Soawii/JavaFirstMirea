package ru.mirea.task8;
import java.util.Scanner;

public class Task_6
{
	public static boolean is_prime(int number, int divisor)
	{
		if (divisor <= 1) return true;
		if (number % divisor == 0)
		{
			System.out.println(divisor);
			return false;
		}
		return is_prime(number, divisor - 1);
	}

	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		System.out.println(is_prime(n, (int)Math.sqrt(n)));
	}
}
