package ru.mirea.task13.Task_3;

import java.util.StringTokenizer;

public class Adress
{
	StringBuilder country = new StringBuilder(), region = new StringBuilder(), city = new StringBuilder();
	StringBuilder street = new StringBuilder(), house = new StringBuilder(), frame = new StringBuilder(), apartment = new StringBuilder();

	StringBuilder[] adresses = {country, region, city, street, house, frame, apartment};

	public Adress(String s)
	{
		String[] splitted = s.split(", ");
		for (int i = 0; i < splitted.length; i++) adresses[i].append(splitted[i]);
	}

	public Adress(String s, String del)
	{
		StringTokenizer st = new StringTokenizer(s, del);
		for (int i = 0; i < adresses.length; i++)
		{
			adresses[i].append(st.nextToken());
		}
	}

	public Adress(String s, String[] del)
	{
		StringBuilder regex = new StringBuilder();
		for (int i = 0; i < del.length; i++)
		{
			if (i > 0) regex.append("|");
			regex.append("(").append(del[i]).append(")");
		}
		String[] splitted = s.split(regex.toString());
		for (int i = 0; i < Math.min(adresses.length, splitted.length); i++)
		{
			adresses[i].append(splitted[i]);
		}
	}

	public void print_string()
	{
		for (int i = 0; i < adresses.length; i++)
		{
			System.out.println(adresses[i].toString());
		}
	}

	public static void main(String[] args)
	{
		Adress a = new Adress("Russia:Moscow;TRN,Salar.16,1,62", new String[]{":", ";", ",", "\\."});
		a.print_string();
	}
}
