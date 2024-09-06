package ru.mirea.task3.Task_3_1;

public class ShopItem
{
	public final String name;
	public final Money price;

	public ShopItem(String name, Money price)
	{
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "ShopItem {" +
				"name='" + name + '\'' +
				", price=" + price +
				"} ";
	}
}
