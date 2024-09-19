package ru.mirea.task12.Task_2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task_2 extends JFrame
{
	public Task_2()
	{
		setTitle("Task 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		if (args.length == 0) return;
		String path = args[0];
		System.out.println(path);

		BufferedImage image = null;
		try
		{
			image = ImageIO.read(new File(path));
		}
		catch (IOException e) {
			System.out.println(e);
			return;
		}

		Task_2 t = new Task_2();
		JLabel label = new JLabel(new ImageIcon(image));
		t.add(label);
		t.setVisible(true);
	}
}
