package ru.mirea.task5.shape;

import java.awt.*;

public class Circle extends Shape
{
	public final int top, left, width, height;

	public Circle(Color color, int top, int left, int width, int height)
	{
		super("Circle", color);
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(left, top, width, height);
	}
}
