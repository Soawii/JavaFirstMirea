package ru.mirea.task6.Task_1;

public class MovableRectangle implements Movable
{
	public MovablePoint topleft, bottomright;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
	{
		topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomright = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public String toString()
	{
		return "MovableRectangle[topleft = " + topleft + ", bottomright = " + bottomright + "]";
	}

	public void moveUp()
	{
		topleft.moveUp();
		bottomright.moveUp();
	}

	public void moveDown()
	{
		topleft.moveDown();
		bottomright.moveDown();
	}

	public void moveLeft()
	{
		topleft.moveLeft();
		bottomright.moveLeft();
	}

	public void moveRight()
	{
		topleft.moveRight();
		bottomright.moveRight();
	}
}
