package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.*;


public class Task_1
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		Pattern p = Pattern.compile("(\\d+)(\\.\\d+)?([ ]*)(EU|RU|US)\\b");
		Matcher m = p.matcher(line);
		while (m.find())
		{
			System.out.println(m.group());
		}
	}
}
