package ru.mirea.task4.Task_2;

public class Tie extends Clothes implements MenClothing
{
	public Tie(Size size, double price, String color)
	{
		super(size, price, color);
	}

	public void dressMan()
	{
		System.out.println("Man tied himself");
	}
}
