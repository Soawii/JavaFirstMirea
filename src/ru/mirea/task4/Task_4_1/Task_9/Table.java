package ru.mirea.task4.Task_4_1.Task_9;

public class Table extends Furniture
{
	int seats;

	public Table(String name, String color, double price, int seats)
	{
		super(name, color, price);
		this.seats = seats;
	}

	@Override
	public double get_volume()
	{
		return seats * 100;
	}
}
