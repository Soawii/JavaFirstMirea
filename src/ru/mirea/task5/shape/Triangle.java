package ru.mirea.task5.shape;

import java.awt.*;

public class Triangle extends Shape
{
	public final int top, left, a;

	public Triangle(Color color, int top, int left, int a)
	{
		super("Triangle", color);
		this.top = top;
		this.left = left;
		this.a = a;
	}

	@Override
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillPolygon(new int[] {left, left + a, (int)(left + a / 2.0)}, new int[] {top, top, top + a}, 3);
	}
}