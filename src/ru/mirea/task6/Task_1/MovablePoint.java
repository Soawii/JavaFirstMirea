package ru.mirea.task6.Task_1;

public class MovablePoint implements Movable
{
	public int x, y, x_speed, y_speed;

	public MovablePoint(int x, int y, int x_speed, int y_speed)
	{
		this.x = x;
		this.y = y;
		this.x_speed = x_speed;
		this.y_speed = y_speed;
	}

	@Override
	public String toString()
	{
		return "MovablePoint" + "[x = " + x + ", y = " + y + ", x_speed = " + x_speed + ", y_speed = " + y_speed + "]";
	}

	public void moveUp()
	{
		y += y_speed;
	}

	public void moveDown()
	{
		y -= y_speed;
	}

	public void moveLeft()
	{
		x -= x_speed;
	}

	public void moveRight()
	{
		x += x_speed;
	}
}
