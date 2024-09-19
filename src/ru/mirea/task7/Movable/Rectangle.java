package ru.mirea.task7.Movable;

public class Rectangle
{
	protected Point top_left, bottom_right;

	public Rectangle(int x1, int y1, int x2, int y2)
	{
		this.top_left = new Point(x1, y1);
		this.bottom_right = new Point(x2, y2);
	}

	public Point getTop_left()
	{
		return top_left;
	}

	public void setTop_left(Point top_left)
	{
		this.top_left = top_left;
	}

	public Point getBottom_right()
	{
		return bottom_right;
	}

	public void setBottom_right(Point bottom_right)
	{
		this.bottom_right = bottom_right;
	}

	@Override
	public String toString()
	{
		return "Rectangle{" +
				"top_left = " + top_left +
				", bottom_right = " + bottom_right +
				'}';
	}
}
