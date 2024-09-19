package ru.mirea.task14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Task_4
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s : ");
		s = sc.nextLine();

		String regex = ".*\\d\\s*\\+.*";
		Pattern p = Pattern.compile(regex);
		System.out.println(p.matcher(s).matches());
	}
}
