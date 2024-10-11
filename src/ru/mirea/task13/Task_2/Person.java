package ru.mirea.task13.Task_2;

import java.lang.StringBuilder;
import java.util.Scanner;

public class Person
{
	public String first_name = "", last_name = "", fathers_name = "";

	public String get_name()
	{
		StringBuilder sb = new StringBuilder().append(last_name);

		if (!fathers_name.isEmpty() || !first_name.isEmpty())
			sb.append(" ");
		if (!first_name.isEmpty())
			sb.append(first_name.charAt(0)).append(".");
		if (!fathers_name.isEmpty())
			sb.append(fathers_name.charAt(0)).append(".");
		return sb.toString();
	}

	public static void main(String[] args)
	{
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		p.first_name = sc.nextLine();
		System.out.print("Enter your last name: ");
		p.last_name = sc.nextLine();
		System.out.print("Enter your fathers name: ");
		p.fathers_name = sc.nextLine();

		System.out.println(p.get_name());
	}
}
