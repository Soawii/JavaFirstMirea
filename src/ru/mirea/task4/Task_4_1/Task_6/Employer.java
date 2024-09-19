package ru.mirea.task4.Task_4_1.Task_6;

public class Employer
{
	public final String firstName, lastName;
	protected double income;

	public Employer(String firstName, String lastName, double income)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.income = income;
	}

	public double getIncome(int days)
	{
		return this.income * days;
	}
}
