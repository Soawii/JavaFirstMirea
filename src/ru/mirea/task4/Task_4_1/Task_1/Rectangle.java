package ru.mirea.task4.Task_4_1.Task_1;

public class Rectangle extends Shape
{
	public final double left, top, width, height;

	public Rectangle(double left, double top, double width, double height)
	{
		super("Rectangle");
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
	}

	@Override
	public double get_area()
	{
		return width * height;
	}

	@Override
	public double get_perimeter()
	{
		return (width + height) * 2;
	}

	@Override
	public String toString()
	{
		return super.toString() + ", topleft = (" + left + ", " + top + "), width = " + width + ", height = " + height;
	}
}
