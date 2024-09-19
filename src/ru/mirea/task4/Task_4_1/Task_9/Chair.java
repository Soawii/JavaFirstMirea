package ru.mirea.task4.Task_4_1.Task_9;

public class Chair extends Furniture
{
	double weight_allowed;

	public Chair(String name, String color, double price, double weight_allowed)
	{
		super(name, color, price);
		this.weight_allowed = weight_allowed;
	}

	@Override
	public double get_volume()
	{
		return weight_allowed;
	}
}
