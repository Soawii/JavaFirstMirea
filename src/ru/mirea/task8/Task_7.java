package ru.mirea.task8;
import java.util.Scanner;

public class Task_7
{
	public static void print_divisors(int number, int divisor)
	{
		if (number < divisor) return;
		while (number % divisor == 0)
		{
			System.out.println(divisor);
			number /= divisor;
		}
		print_divisors(number, divisor + 1);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n = sc.nextInt();

		print_divisors(n, 2);
	}
}
