package ru.mirea.task14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5
{
	static int[] days_in_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args)
	{
		String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|[2-9]\\d)\\d{2})";
		Pattern pattern = Pattern.compile(regex);

		String date;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		date = sc.nextLine();

		Matcher matcher = pattern.matcher(date);
		// check regex
		if (!matcher.matches())
		{
			System.out.println("Invalid date");
			return;
		}
		// if regex passed days could still be incorrect
		int day = 0, month = 0, year = 0;
		day = Integer.parseInt(matcher.group(1));
		month = Integer.parseInt(matcher.group(2));
		year = Integer.parseInt(matcher.group(3));

		if (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)))
			days_in_month[month - 1]++;
		boolean date_exists = true;
		if (day > days_in_month[month - 1])
			date_exists = false;
		System.out.println(date_exists ? "Valid date" : "Invalid date");
	}
}
