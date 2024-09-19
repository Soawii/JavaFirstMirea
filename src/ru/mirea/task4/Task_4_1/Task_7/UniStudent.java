package ru.mirea.task4.Task_4_1.Task_7;

public class UniStudent extends Student
{
	public int year;

	public UniStudent(String name, int age, int year)
	{
		super(name, age);
		this.year = year;
	}

	@Override
	public String toString()
	{
		return super.toString() + " [University Year = " + year + "]";
	}
}
