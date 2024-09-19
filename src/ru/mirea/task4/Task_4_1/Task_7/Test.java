package ru.mirea.task4.Task_4_1.Task_7;

public class Test
{
	public static void main(String[] args)
	{
		Student[] students = {new SchoolStudent("Tim", 14, 8), new UniStudent("Dan", 20, 2)};

		for (Student student : students)
		{
			System.out.println(student);
		}
	}
}
