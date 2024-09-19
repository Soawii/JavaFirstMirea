package ru.mirea.task4.Task_4_1.Task_7;

public class SchoolStudent extends Student
{
	public int grade;

	public SchoolStudent(String name, int age, int grade)
	{
		super(name, age);
		this.grade = grade;
	}

	@Override
	public String toString()
	{
		return super.toString() + " [School Grade = " + grade + "]";
	}
}
