package ru.mirea.task14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Task_1
{
	public static void main(String[] args)
	{
		String s, regex;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s : ");
		s = sc.nextLine();
		System.out.print("Enter regex : ");
		regex = sc.nextLine();

		Pattern p = Pattern.compile(regex);
		String[] split = p.split(s);
		System.out.println(Arrays.toString(split));
	}
}
