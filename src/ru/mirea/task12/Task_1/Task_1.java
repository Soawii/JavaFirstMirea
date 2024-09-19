package ru.mirea.task12.Task_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task_1 extends JFrame
{
	int N = 5, M = 4;
	Shape[][] shapes = new Shape[N][M];

	public Task_1()
	{
		setLayout(new GridLayout(N, M));
		setTitle("Task 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(M * 100 + 50, N * 100 + 50);

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				int r = (int) (Math.random() * 255);
				int b = (int) (Math.random() * 255);
				int g = (int) (Math.random() * 255);

				int shape = (int) (Math.random() * 3);
				if (shape == 0)
					shapes[i][j] = new Circle(new Color(r, g, b), i, j);
				else if (shape == 1)
					shapes[i][j] = new Square(new Color(r, g, b), i, j);
				else
					shapes[i][j] = new Triangle(new Color(r, g, b), i, j);

				add(shapes[i][j]);
			}
		}
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Task_1 frame = new Task_1();
	}
}
