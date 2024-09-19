package ru.mirea.task4.Task_2;

public class Pants extends Clothes implements MenClothing, WomenClothing
{
	public Pants(Size size, double price, String color)
	{
		super(size, price, color);
	}

	public void dressMan()
	{
		System.out.println("Man took panths on");
	}
	public void dressWoman()
	{
		System.out.println("Man took panths on");
	}
}
