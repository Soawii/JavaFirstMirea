package ru.mirea.task17.Task_2;

public class EmployeeView
{
	public void print_details(Employee e)
	{
		System.out.println("Printing about employee...");
		System.out.println("Name: " + e.getName());
		System.out.println("Salary: " + e.getSalary());
	}
}
