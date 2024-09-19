package ru.mirea.task13.Task_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Enter file name: ");
		Scanner sc = new Scanner(System.in);
		String file_name = sc.nextLine();
		sc.close();

		File new_file = new File(file_name);
		sc = new Scanner(new_file);
		sc.useDelimiter(" ");
		while (sc.hasNext())
		{
			String next_word = sc.next();

		}
		sc.close();
	}
}
