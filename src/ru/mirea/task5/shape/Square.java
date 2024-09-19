package ru.mirea.task5.shape;

import java.awt.*;

public class Square extends Shape
{
	public final int top, left, a;

	public Square(Color color, int top, int left, int a)
	{
		super("Square", color);
		this.top = top;
		this.left = left;
		this.a = a;
	}

	@Override
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillRect(left, top, a, a);
	}
}
