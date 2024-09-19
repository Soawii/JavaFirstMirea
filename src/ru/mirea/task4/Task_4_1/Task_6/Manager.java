package ru.mirea.task4.Task_4_1.Task_6;

public class Manager extends Employer
{
	public double average_sum;

	public Manager(String firstName, String lastName, double income, double average_sum)
	{
		super(firstName, lastName, income);
		this.average_sum = average_sum;
	}

	@Override
	public double getIncome(int days)
	{
		return super.getIncome(days) + average_sum;
	}

	public static void main(String[] args)
	{
		Employer e = new Manager("John", "Baker", 24.45, 5);

		Employer[] arr = {new Employer("a", "b", 4),
				new Manager("c", "d", 20, 1),
				new Manager("e", "f", 40, 10)};

		for (Employer a : arr)
		{
			System.out.println(a.getIncome(10));
		}
	}
}
