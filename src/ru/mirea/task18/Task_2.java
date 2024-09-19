package ru.mirea.task18;

import java.util.Scanner;

public class Task_2 {
	public void exceptionDemo() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print( "Enter an integer ");
		int i = 1;
		String intString = myScanner.next();
		try
		{
			i = Integer.parseInt(intString);
		}
		catch (Exception e)
		{
			System.out.println("Invalid input: " + intString);
			return;
		}
		finally
		{
			System.out.println("[number scanned]");
		}
		System.out.println( 2/i );
	}

	public static void main(String[] args)
	{
		Task_2 obj = new Task_2();
		obj.exceptionDemo();
	}
}
