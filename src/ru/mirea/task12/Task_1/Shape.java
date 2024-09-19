package ru.mirea.task12.Task_1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JPanel
{
	protected Color color;
	protected int row, col;

	public abstract void paintComponent(Graphics g);

	Shape(Color color, int row, int col)
	{
		this.color = color;
		this.row = row;
		this.col = col;
	}
}
