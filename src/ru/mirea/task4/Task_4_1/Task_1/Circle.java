package ru.mirea.task4.Task_4_1.Task_1;

public class Circle extends Shape
{
	double x, y, r;

	public Circle(double x, double y, double r)
	{
		super("Circle");
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public double get_area()
	{
		return Math.PI * r * r;
	}

	@Override
	public double get_perimeter()
	{
		return 2 * Math.PI * r;
	}

	@Override
	public String toString()
	{
		return super.toString() + ", center = (" + x + ", " + y + "), radius = " + r;
	}
}
