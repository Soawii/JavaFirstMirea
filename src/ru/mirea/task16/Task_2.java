package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorRadio extends JRadioButtonMenuItem
{
	public ColorRadio(String text)
	{
		super(text);
	}
}

class FontRadio extends JRadioButtonMenuItem
{
	public FontRadio(String text)
	{
		super(text);
	}
}

public class Task_2 extends JFrame implements ActionListener
{
	JTextArea text;

	public Task_2()
	{
		setTitle("Task 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu_color = new JMenu("Color");
		ColorRadio radioMenuItem_blue = new ColorRadio("Blue");
		ColorRadio radioMenuItem_red = new ColorRadio("Red");
		ColorRadio radioMenuItem_black = new ColorRadio("Black");
		radioMenuItem_blue.addActionListener(this);
		radioMenuItem_red.addActionListener(this);
		radioMenuItem_black.addActionListener(this);
		radioMenuItem_black.setSelected(true);

		JMenu menu_font = new JMenu("Font");
		FontRadio font_tnr = new FontRadio("Times New Roman");
		FontRadio font_sans = new FontRadio("MS Sans Serif");
		FontRadio font_courier = new FontRadio("Courier New");
		font_tnr.addActionListener(this);
		font_sans.addActionListener(this);
		font_courier.addActionListener(this);
		font_tnr.setSelected(true);

		ButtonGroup color_group = new ButtonGroup(), font_group = new ButtonGroup();
		color_group.add(radioMenuItem_blue);
		color_group.add(radioMenuItem_red);
		color_group.add(radioMenuItem_black);
		font_group.add(font_tnr);
		font_group.add(font_sans);
		font_group.add(font_courier);

		menu_color.add(radioMenuItem_blue);
		menu_color.add(radioMenuItem_red);
		menu_color.add(radioMenuItem_black);

		menu_font.add(font_tnr);
		menu_font.add(font_sans);
		menu_font.add(font_courier);

		menuBar.add(menu_color);
		menuBar.add(menu_font);

		text = new JTextArea();
		text.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		add(text);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		var source = e.getSource();
		if (source instanceof ColorRadio)
		{
			JRadioButtonMenuItem temp = (JRadioButtonMenuItem)source;
			String name = temp.getText();
			if ("Blue".equals(name))
				text.setForeground(Color.BLUE);
			else if ("Red".equals(name))
				text.setForeground(Color.RED);
			else if ("Black".equals(name))
				text.setForeground(Color.BLACK);
		}
		else if (source instanceof FontRadio)
		{
			JRadioButtonMenuItem temp = (JRadioButtonMenuItem)source;
			String name = temp.getText();
			System.out.println(name);
			if ("Times New Roman".equals(name))
				text.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			else if ("MS Sans Serif".equals(name))
				text.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
			else if ("Courier New".equals(name))
				text.setFont(new Font("Courier New", Font.PLAIN, 16));
		}
	}

	public static void main(String[] args)
	{
		new Task_2();
	}
}
