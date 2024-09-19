package ru.mirea.task4.Task_4_1.Task_7;

public class Student
{
	public final String name;
	public int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Student [name = " + name + ", age = " + age + "]";
	}
}
