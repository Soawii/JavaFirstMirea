package ru.mirea.task7.Movable;

public class MovableRectangle extends Rectangle implements Movable
{
	int x_speed, y_speed;

	public MovableRectangle(int x1, int y1, int x2, int y2, int x_speed, int y_speed)
	{
		super(x1, y1, x2, y2);
		this.x_speed = x_speed;
		this.y_speed = y_speed;
	}

	public void moveUp()
	{
		top_left.y += y_speed;
		bottom_right.y += y_speed;
	}

	public void moveDown()
	{
		top_left.y -= y_speed;
		bottom_right.y -= y_speed;
	}

	public void moveRight()
	{
		top_left.x += x_speed;
		bottom_right.x += x_speed;
	}

	public void moveLeft()
	{
		top_left.x -= x_speed;
		bottom_right.x -= x_speed;
	}

	@Override
	public String toString()
	{
		return "MovableRectangle{" + super.toString() + ", x_speed = " + x_speed + ", y_speed = " + y_speed + "}";
	}
}
