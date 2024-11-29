package ru.mirea.lists2;

import java.util.Scanner;

public class Task9
{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a string (0 for termination): ");
			String s = sc.nextLine().strip();


			if (s.strip().equals("0")) break;
			if (list.isEmpty()) {
				list.add(s);
			}
			else {
				for (int i = 0; i <= list.size; i++) {
					if (i == list.size || list.at(i).compareTo(s) >= 0) {
						list.add(s, i);
						break;
					}
				}
			}
			System.out.println(list);
		}
	}
}
