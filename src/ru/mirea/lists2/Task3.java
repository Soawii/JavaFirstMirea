package ru.mirea.lists2;

import java.util.Scanner;

public class Task3
{

	public static void main(String[] args) {
		CycleLinkedList<Integer> list = new CycleLinkedList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a number (0 for termination and sort): ");
			Integer number = sc.nextInt();

			if (number == 0) break;
			list.add(number);
			System.out.println(list);
		}

		int i = 0;
		while (i < list.size - 1) {
			Integer temp = list.at(i);
			if (temp > list.at(i + 1))
			{
				list.pop(i);
				list.add(temp, i + 1);
				if (i > 0)
					i--;
				System.out.println(list);
			}
			else
				i++;
		}
	}
}
