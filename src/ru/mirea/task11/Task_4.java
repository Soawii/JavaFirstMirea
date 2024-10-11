package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task_4
{
	public static void main(String[] args)
	{
		String format = "<yyyy><MM><dd><HH><mm>";
		SimpleDateFormat ymd_sdf = new SimpleDateFormat(format);
		Date date;
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			try
			{
				System.out.print("Enter date in format " + format + ": ");
				String date_time = sc.nextLine();
				date = ymd_sdf.parse(date_time);
			}
			catch (ParseException e)
			{
				System.out.println(e.getMessage());
				continue;
			}
			break;
		}

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		System.out.println(calendar);
	}
}
