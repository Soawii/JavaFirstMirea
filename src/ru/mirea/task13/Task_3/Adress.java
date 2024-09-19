package ru.mirea.task13.Task_3;

import java.util.StringTokenizer;

public class Adress
{
	StringBuilder country = new StringBuilder(), region = new StringBuilder(), city = new StringBuilder();
	StringBuilder street = new StringBuilder(), house = new StringBuilder(), frame = new StringBuilder(), apartment = new StringBuilder();

	StringBuilder[] adressses = {country, region, city, street, house, frame, apartment};

	public Adress(String s)
	{
		String[] splitted = s.split(", ");
		for (int i = 0; i < splitted.length; i++) adressses[i].append(splitted[i]);
	}

	public Adress(String s, String del)
	{
		String[] splitted = s.split(del);
		for (int i = 0; i < splitted.length; i++) adressses[i].append(splitted[i]);
	}

	public Adress(String s, String[] del)
	{
		StringTokenizer st = new StringTokenizer(s, ",.:;\t\n\r");
		for (int i = 0; i < adressses.length; i++)
		{
			adressses[i].append(st.nextToken());
		}
	}

	public void print_string()
	{
		for (int i = 0; i < adressses.length; i++)
		{
			System.out.println(adressses[i].toString());
		}
	}

	public static void main(String[] args)
	{
		Adress a = new Adress("Russia:Moscow;TRN,Salar.16,1,62", new String[]{"a"});
		a.print_string();
	}
}
