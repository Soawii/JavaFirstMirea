package ru.mirea.task11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test
{
	public static void main(String[] args)
	{
		Student s = new Student("a", "b", "a", "a", 2, 24, 2.4, new GregorianCalendar(2005, Calendar.OCTOBER, 10).getTime());
		System.out.println(s);
		s.printBirthDate("YYYY-MM-dd");
	}
}
