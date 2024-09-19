package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.*;

public class Task_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		Pattern p = Pattern.compile("\\b(?=.*\\d)(?=.*[a-z])(?=[A-Z])(\\w{8,})");
		Matcher m = p.matcher(line);
		System.out.println(m.matches());
	}
}
