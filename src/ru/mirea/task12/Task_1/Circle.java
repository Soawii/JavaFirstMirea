package ru.mirea.task12.Task_1;

import java.awt.*;

public class Circle extends Shape
{
	public Circle(Color color, int row, int col)
	{
		super(color, row, col);
	}

	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(color);
		int width = (int)(Math.random() * 70 + 30);
		g.fillOval(50 - width / 2, 50 - width / 2, width, width);
	}
}
