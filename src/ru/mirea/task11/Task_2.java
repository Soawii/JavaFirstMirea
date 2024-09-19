package ru.mirea.task11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task_2
{
	public static void main(String[] args) throws ParseException
	{
		String date_format_string = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(date_format_string);
		System.out.print("Enter date to compare to in this format - " + date_format_string + ": ");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		Date date_to_compare = sdf.parse(date);

		int comparison = date_to_compare.compareTo(new Date());
		System.out.println("The chosen date is " + (comparison == 0 ? "equal" : (comparison < 0 ? "smaller" : "bigger")) + " than the current date");
	}
}
