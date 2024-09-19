package ru.mirea.task12.Task_1;

import java.awt.*;

public class Triangle extends Shape
{
	public Triangle(Color color, int row, int col)
	{
		super(color, row, col);
	}

	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(color);
		g.fillPolygon(new int[]{0, 50, 100}, new int[]{0, 100, 0}, 3);
	}
}
