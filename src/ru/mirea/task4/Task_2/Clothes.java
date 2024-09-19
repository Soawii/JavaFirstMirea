package ru.mirea.task4.Task_2;

public abstract class Clothes
{
	Size size;
	double price;
	String color;

	public Clothes(Size size, double price, String color)
	{
		this.size = size;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString()
	{
		return "Clothes {" +
				"size = " + size + ' ' + size.get_description() + ' ' + 
				", price = " + price +
				", color = '" + color + '\'' +
				"} ";
	}
}
