package ru.mirea.task4.Task_4_1.Task_1;

public abstract class Shape
{
	protected final String type;

	public Shape(String type)
	{
		this.type = type;
	}

	String get_type()
	{
		return type;
	}

	@Override
	public String toString()
	{
		return "Shape = " + this.type + ", Area = " + get_area() + ", P = " + get_perimeter();
	}

	public abstract double get_area();

	public abstract double get_perimeter();
}