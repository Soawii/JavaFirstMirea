package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;

public class Task_1
{
	public static void main(String[] args) throws ParseException
	{
		Date made_date = new SimpleDateFormat("dd/MM/yy hh:mm:ss").parse("08/09/24 16:45:54");
		Date current_date = new Date();
		System.out.println("Tyupalov, Made date: " + made_date + ", Current date: " + current_date);
	}
}
