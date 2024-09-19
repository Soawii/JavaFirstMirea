package ru.mirea.task8;
import java.util.Scanner;

public class Task_8
{
	public static boolean is_palindrome(String s, int i, int j)
	{
		if (i >= j) return true;
		if (s.charAt(i) != s.charAt(j)) return false;
		return is_palindrome(s, i+1, j-1);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Enter the string : ");
		s = sc.nextLine();

		System.out.println(is_palindrome(s, 0, s.length() - 1));
	}
}
