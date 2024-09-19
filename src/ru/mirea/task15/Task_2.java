package ru.mirea.task15;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Task_2 extends JFrame implements ActionListener
{
	public String[] countries = {"Australia", "China", "England", "Russia"};
	public Task_2()
	{

		super("Тестовое окно");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComboBox countriesBox = new JComboBox(countries);
		countriesBox.setSelectedIndex(0);
		countriesBox.addActionListener(this);
		setPreferredSize(new Dimension(300, 60));
		add(countriesBox);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JComboBox countriesBox = (JComboBox) e.getSource();
		String country = countriesBox.getSelectedItem().toString();

		if ("Australia".equals(country))
		{
			System.out.println("Australia, officially the Commonwealth of Australia, is a country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands");
		}
		else if ("China".equals(country))
		{
			System.out.println("China, officially the People's Republic of China, is a country in East Asia. With a population exceeding 1.4 billion, it is the world's second-most populous country after India");
		}
		else if ("England".equals(country))
		{
			System.out.println("England is a country that is part of the United Kingdom. It is located on the island of Great Britain, of which it covers approximately 62%, and over 100 smaller adjacent islands");
		}
		else if ("Russia".equals(country))
		{
			System.out.println("Russia is a country spanning Eastern Europe and North Asia. It is the largest country in the world by area, extending across eleven time zones and sharing land borders with fourteen countries. It is the world's ninth-most populous country and Europe's most populous country.");
		}
	}

	public static void main(String[] args)
	{
		new Task_2();
	}
}