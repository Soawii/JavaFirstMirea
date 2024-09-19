package ru.mirea.task4.Task_2;

public class TShirt extends Clothes implements MenClothing, WomenClothing
{
	public TShirt(Size size, double price, String color)
	{
		super(size, price, color);
	}

	public void dressMan()
	{
		System.out.println("Man took on a TShirt");
	}
	public void dressWoman()
	{
		System.out.println("Woman took on a TShirt");
	}
}
