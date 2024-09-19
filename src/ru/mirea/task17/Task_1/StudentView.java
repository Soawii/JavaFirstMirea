package ru.mirea.task17.Task_1;

public class StudentView
{
	public void printStudentDetails(Student s)
	{
		System.out.println("Printing student details:");
		System.out.println("Name: " + s.getName());
		System.out.println("Roll No: " + s.getRollNo());
	}
}
