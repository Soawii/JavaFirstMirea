package ru.mirea.task9;

public class Student implements Comparable<Student>
{
	public int StudentID;
	double GPA;
	String name;

	public Student(int studentID, String name, double GPA)
	{
		this.StudentID = studentID;
		this.name = name;
		this.GPA = GPA;
	}

	@Override
	public int compareTo(Student other)
	{
		return this.StudentID - other.StudentID;
	}

	@Override
	public String toString()
	{
		return "Student ID: " + StudentID + ", GPA: " + String.format("%.2f", GPA);
	}
}
