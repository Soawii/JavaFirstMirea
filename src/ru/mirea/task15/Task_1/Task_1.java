package ru.mirea.task15.Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;

class MyAL implements ActionListener
{
	private JTextField first_number, second_number;
	public MyAL(JTextField first_number, JTextField second_number)
	{
		this.first_number = first_number;
		this.second_number = second_number;
	}
	public void actionPerformed(ActionEvent e)
	{
		String ac = e.getActionCommand();
		double a, b;
		try
		{
			a = Double.parseDouble(first_number.getText().trim());
			b = Double.parseDouble(second_number.getText().trim());
		} catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			return;
		}
		if ("+".equals(ac))
			JOptionPane.showMessageDialog(null, "a + b = " + (a + b), "Result", JOptionPane.INFORMATION_MESSAGE);
		else if ("-".equals(ac))
			JOptionPane.showMessageDialog(null, "a - b = " + (a - b), "Result", JOptionPane.INFORMATION_MESSAGE);
		else if ("*".equals(ac))
			JOptionPane.showMessageDialog(null, "a * b = " + (a * b), "Result", JOptionPane.INFORMATION_MESSAGE);
		else if ("/".equals(ac))
			JOptionPane.showMessageDialog(null, "a / b = " + (a / b), "Result", JOptionPane.INFORMATION_MESSAGE);
	}
}

public class Task_1 extends JFrame
{
	public Task_1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		setSize(300, 200);
		setLayout(new FlowLayout());

		JTextField first_number = new JTextField(15);

		JTextField second_number = new JTextField(15);

		MyAL al = new MyAL(first_number, second_number);

		JButton add_button = new JButton("+");
		add_button.setActionCommand("+");
		add_button.addActionListener(al);
		add_button.setSize(80, 30);

		JButton sub_button = new JButton("-");
		sub_button.setActionCommand("-");
		sub_button.addActionListener(al);
		sub_button.setSize(80, 30);

		JButton multiply_button = new JButton("*");
		multiply_button.setActionCommand("*");
		multiply_button.addActionListener(al);
		multiply_button.setSize(80, 30);

		JButton divide_button = new JButton("/");
		divide_button.setActionCommand("/");
		divide_button.addActionListener(al);
		divide_button.setSize(80, 30);

		add(new JLabel("First number"));
		add(first_number);
		add(new JLabel("Second number"));
		add(second_number);
		add(add_button);
		add(sub_button);
		add(multiply_button);
		add(divide_button);
	}
	public static void main(String[] args)
	{
		new Task_1().setVisible(true);
	}
}
