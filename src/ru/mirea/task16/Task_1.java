package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;

public class Task_1 extends JFrame implements ActionListener
{
	private final int number;
	int attempts_left = 3;
	JTextField text_field;
	public Task_1()
	{
		number = (int)(Math.random() * 20);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number Guesser");
		setSize(300, 200);
		setLayout(new FlowLayout());

		text_field = new JTextField(10);

		JButton guess_button = new JButton("Guess");
		guess_button.addActionListener(this);

		add(text_field);
		add(guess_button);
		pack();
	}

	public void actionPerformed(ActionEvent e)
	{
		try
		{
			int number_entered = Integer.parseInt(text_field.getText().trim());
			if (number_entered == number)
			{
				JOptionPane.showMessageDialog(null, "Number guessed correctly!", "", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			else
			{
				attempts_left--;
				if (attempts_left == 0)
				{
					JOptionPane.showMessageDialog(null, "No attempts left, game over!", "", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				if (number_entered < number)
				{
					JOptionPane.showMessageDialog(null, "Entered number is smaller than the guessed one! Attempts left: " + attempts_left, "", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Entered number is bigger than the guessed one! Attempts left: " + attempts_left, "", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args)
	{
		new Task_1().setVisible(true);
	}
}
