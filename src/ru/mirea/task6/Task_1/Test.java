package ru.mirea.task6.Task_1;

public class Test
{
	public static void main(String[] args)
	{
		Movable c = new MovableRectangle(1, 5, 3, 1, 2, 2);

		c.moveUp();
		c.moveRight();

		System.out.println(c);
	}
}
