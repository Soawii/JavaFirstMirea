package ru.mirea.task4.Task_2;

public class Skirt extends Clothes implements WomenClothing
{
	public Skirt(Size size, double price, String color)
	{
		super(size, price, color);
	}

	public void dressWoman()
	{
		System.out.println("Woman took skirt on");
	}
}
