package ru.mirea.lists2;

import java.util.Scanner;

public class Task2
{
	public static void main(String[] args) {
		DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a number (0 for termination and sort): ");
			Integer number = sc.nextInt();

			if (number == 0) break;
			list.add(number);
			System.out.println(list);
		}

		for (int i = 0; i < list.size; i++) {
			Integer max = Integer.MIN_VALUE;
			int index = -1;

			for (int j = i; j < list.size; j++) {
				Integer temp = list.at(j);
				if (temp > max) {
					max = temp;
					index = j;
				}
			}

			list.pop(index);
			list.add(max, 0);
			System.out.println(list);
		}
	}
}
