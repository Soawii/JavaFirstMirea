package ru.mirea.task3.Task_3_1;

public class Report
{
	private static final int WIDTH = 26;
	public static void generateReport(Shop shop)
	{
		System.out.printf("%" + (WIDTH/2 + 3) + "s\n", "REPORT");
		System.out.printf("Name%"+(WIDTH - 4)+"s\n", "Salary");
		for (int i = 0; i < shop.employee_amount; i++)
		{
			System.out.printf(shop.employees[i].fullname + "%" + (WIDTH - shop.employees[i].fullname.length()) + "s\n", shop.employees[i].salary);
		}
	}
}
