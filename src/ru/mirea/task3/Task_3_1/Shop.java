package ru.mirea.task3.Task_3_1;

import java.util.Arrays;

public class Shop
{
	private ShopItem[] items = new ShopItem[10];
	int item_amount = 0;
	public Employee[] employees = new Employee[10];
	int employee_amount = 0;

	public void add_item(ShopItem item)
	{
		if (item_amount == items.length)
		{
			ShopItem[] temp = new ShopItem[items.length * 2];
			System.arraycopy(items, 0, temp, 0, items.length);
			items = temp;
		}
		items[item_amount++] = item;
	}

	public void add_employee(Employee employee)
	{
		if (employee_amount == employees.length)
		{
			Employee[] temp = new Employee[employees.length * 2];
			System.arraycopy(employees, 0, temp, 0, employees.length);
			employees = temp;
		}
		employees[employee_amount++] = employee;
	}

	public Money[] get_item_price(String name)
	{
		CurrencyConverter converter = new CurrencyConverter();
		for (int i = 0; i < item_amount; i++)
		{
			if (items[i].name.equals(name))
			{
				Money p = items[i].price;
				return converter.convert_currency(p);
			}
		}
		return null;
	}

	@Override
	public String toString()
	{
		return "Shop {" +
				"items=" + Arrays.toString(items) +
				", item_amount=" + item_amount + " ";
	}
}
