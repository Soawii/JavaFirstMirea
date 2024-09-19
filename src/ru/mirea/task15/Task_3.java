package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Task_3 extends JFrame
{
	public Task_3()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu fileMenu = new JMenu("File");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(save);
		fileMenu.add(exit);
		menuBar.add(fileMenu);

		JMenu editMenu = new JMenu("Edit");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		JMenuItem cut = new JMenuItem("Cut");
		editMenu.add(copy);
		editMenu.add(paste);
		editMenu.add(cut);
		menuBar.add(editMenu);

		JMenuItem help = new JMenuItem("Help");
		menuBar.add(help);

		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		setLayout(new FlowLayout());
		add(button1);
		add(button2);

		pack();
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Task_3();
	}
}
