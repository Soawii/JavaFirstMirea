package ru.mirea.task7.Movable;

public class Point
{
	public int x, y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Point(" +
				"x = " + x +
				", y = " + y +
				')';
	}
}
