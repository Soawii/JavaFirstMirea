package ru.mirea.task5.shape;

import java.awt.*;
import javax.swing.*;

public abstract class Shape
{
	protected String type;
	protected Color color;

	public Shape(String type, Color color)
	{
		this.type = type;
		this.color = color;
	}

	public abstract void draw(Graphics g);
}
