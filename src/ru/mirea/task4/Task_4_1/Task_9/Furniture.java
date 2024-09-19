package ru.mirea.task4.Task_4_1.Task_9;

public abstract class Furniture
{
	String name, color;
	double price;

	public Furniture(String name, String color, double price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public abstract double get_volume();

}
