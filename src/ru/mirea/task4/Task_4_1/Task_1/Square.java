package ru.mirea.task4.Task_4_1.Task_1;

public class Square extends Shape
{
	public final double left, top, a;

	public Square(double left, double top, double a)
	{
		super("Square");
		this.left = left;
		this.top = top;
		this.a = a;
	}

	@Override
	public double get_area()
	{
		return a * a;
	}

	@Override
	public double get_perimeter()
	{
		return a * 4;
	}

	@Override
	public String toString()
	{
		return super.toString() + ", topleft = (" + left + ", " + top + "), a = " + a;
	}
}