package ru.mirea.task3.Task_3_1;

import java.util.Arrays;

public class Testing
{
	public static void main(String[] args)
	{
		Shop shop = new Shop();
		shop.add_item(new ShopItem("a", new Money(CurrencyList.get_currency("ru"), 100)));
		shop.add_item(new ShopItem("b", new Money(CurrencyList.get_currency("fr"), 50)));
		shop.add_item(new ShopItem("c", new Money(CurrencyList.get_currency("us"), 10)));

		shop.add_employee(new Employee(new Money(CurrencyList.get_currency("ru"), 10000), "Anna"));
		shop.add_employee(new Employee(new Money(CurrencyList.get_currency("fr"), 200), "Johnny"));
		shop.add_employee(new Employee(new Money(CurrencyList.get_currency("us"), 500), "Jane"));


		System.out.println(shop);
		System.out.println(Arrays.toString(shop.get_item_price("b")));
		Report.generateReport(shop);
	}
}
