package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task_4
{
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		String date_time = sc.nextLine();

		SimpleDateFormat ymd_sdf = new SimpleDateFormat("<yyyy><MM><dd><HH><mm>");

		Date date = ymd_sdf.parse(date_time);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		System.out.println(date);
	}
}
