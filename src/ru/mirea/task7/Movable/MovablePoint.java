package ru.mirea.task7.Movable;

public class MovablePoint extends Point implements Movable
{
	public int x_speed, y_speed;

	public MovablePoint(int x, int y, int x_speed, int y_speed)
	{
		super(x, y);
		this.x_speed = x_speed;
		this.y_speed = y_speed;
	}

	public void moveUp()
	{
		y += y_speed;
	}

	public void moveDown()
	{
		y -= y_speed;
	}

	public void moveRight()
	{
		x += x_speed;
	}

	public void moveLeft()
	{
		x -= x_speed;
	}

	@Override
	public String toString()
	{
		return "MovablePoint{" + super.toString() + ", x_speed = " + x_speed + ", y_speed = " + y_speed + '}';
	}
}
