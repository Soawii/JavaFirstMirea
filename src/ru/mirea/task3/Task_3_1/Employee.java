package ru.mirea.task3.Task_3_1;

public class Employee
{
	public final String fullname;
	public Money salary;

	public Employee(Money salary, String fullname)
	{
		this.salary = salary;
		this.fullname = fullname;
	}

	@Override
	public String toString()
	{
		return "Employee {" +
				"fullname='" + fullname + '\'' +
				", salary=" + salary +
				"} ";
	}
}
