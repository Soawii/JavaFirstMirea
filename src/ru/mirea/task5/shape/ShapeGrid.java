package ru.mirea.task5.shape;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeGrid extends JPanel
{
	static final int WIDTH = 400, HEIGHT = 500;
	public final int N = 5, M = 4, G_W = 100;
	Shape[][] shapes = new Shape[N][M];
	Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK};

	public ShapeGrid()
	{
		setPreferredSize(new Dimension(WIDTH, HEIGHT));

		Random r = new Random();
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				int random_int = r.nextInt(3);
				Color color_chosen = colors[r.nextInt(colors.length)];
				if (random_int == 0)
				{
					shapes[i][j] = new Circle(color_chosen, i * G_W, j * G_W, G_W, G_W);
				}
				else if (random_int == 1)
				{
					shapes[i][j] = new Square(color_chosen, i * G_W, j * G_W, G_W);
				}
				else
				{
					shapes[i][j] = new Triangle(color_chosen, i * G_W, j * G_W, G_W);
				}
				System.out.println("top " + i * G_W + ", left " + j * G_W);
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				shapes[i][j].draw(g);
			}
		}
	}

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.add(new ShapeGrid());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
