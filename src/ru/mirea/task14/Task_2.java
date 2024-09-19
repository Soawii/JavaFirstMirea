package ru.mirea.task14;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Task_2
{
	public static void main(String[] args)
	{
		String s, regex = "abcdefghijklmnopqrstuv18340";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s : ");
		s = sc.nextLine();

		Pattern p = Pattern.compile(regex);
		System.out.println(p.matcher(s).matches());
	}
}
