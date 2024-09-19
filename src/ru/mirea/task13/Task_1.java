package ru.mirea.task13;

public class Task_1
{
	void string_changes(String s)
	{
		System.out.println("Last character = " + s.charAt(s.length() - 1));
		System.out.println(s.endsWith("!!!"));
		System.out.println(s.startsWith("I like"));
		System.out.println(s.contains("Java"));
		System.out.println(s.indexOf("Java"));
		s = s.replace('a', 'o');
		s = s.toUpperCase();
		s =  s.toLowerCase();
		s = s.substring(0, 5);
	}

	public static void main(String[] args)
	{
		Task_1 t = new Task_1();
		t.string_changes("I like Java!!!");
	}
}
