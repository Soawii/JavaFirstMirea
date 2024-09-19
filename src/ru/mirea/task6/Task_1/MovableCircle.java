package ru.mirea.task6.Task_1;

public class MovableCircle implements Movable
{
	public int radius;
	public MovablePoint center;

	public MovableCircle(int x, int y, int x_speed, int y_speed, int radius)
	{
		this.radius = radius;
		this.center = new MovablePoint(x, y, x_speed, y_speed);
	}

	@Override
	public String toString()
	{
		return "MovableCircle[radius = " + radius + ", center = " + center + "]";
	}

	public void moveUp()
	{
		center.moveUp();
	}

	public void moveDown()
	{
		center.moveDown();
	}

	public void moveLeft()
	{
		center.moveLeft();
	}

	public void moveRight()
	{
		center.moveRight();
	}
}
