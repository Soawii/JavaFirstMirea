package ru.mirea.lists1;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		MyList<Student> list = new DoubleLinkedList<Student>();

		while (true) {
			System.out.println("commands: add [item], add [item] [at], delete [item], pop [at], at [at], print, clear, isEmpty, end");

			String command;
			Scanner sc = new Scanner(System.in);
			command = sc.next("\\b\\w+\\b");

			if (command.equals("add")) {
				String[] items = sc.nextLine().strip().split(" ");
				System.out.println(Arrays.toString(items));
				Student item = StudentFactory.createStudent(items[0]);
				if (items.length == 1) {
					list.add(item);
				}
				else {
					int index = Integer.parseInt(items[1]);
					list.add(item, index);
				}
			}
			else if (command.equals("delete")) {
				Student item = StudentFactory.createStudent(sc.next());
				list.delete(item);
			}
			else if (command.equals("pop")) {
				int index = sc.nextInt();
				list.pop(index);
			}
			else if (command.equals("at")) {
				int index = sc.nextInt();
				System.out.println(list.at(index));
			}
			else if (command.equals("print")) {
				System.out.println(list);
			}
			else if (command.equals("clear")) {
				list.clear();
			}
			else if (command.equals("isEmpty")) {
				System.out.println(list.isEmpty());
			}
			else if (command.equals("end")) {
				break;
			}
			else {
				System.out.println("Incorrect command, try again");
			}
		}
	}
}
