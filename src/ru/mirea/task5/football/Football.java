package ru.mirea.task5.football;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Football
{
	public static int milan_count = 0, madrid_count = 0;
	public static String last_scorer = "N/A";

	public static void update_labels(JLabel res, JLabel ls, JLabel winner)
	{
		res.setText("Result " + milan_count + " X " + madrid_count);
		ls.setText("Last Scorer: " + last_scorer);
		winner.setText("Winner: " + (milan_count == madrid_count ? "DRAW" : (milan_count > madrid_count ? "AC Milan" : "Real Madrid")));
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Match Simulation");
		frame.setSize(300, 300);

		JPanel panel = new JPanel();

		JButton button_milan = new JButton("AC Milan");
		JButton button_madrid = new JButton("Real Madrid");

		JLabel label_result = new JLabel();
		JLabel label_last_score = new JLabel();
		JLabel label_winner = new JLabel();

		update_labels(label_result, label_last_score, label_winner);

		button_milan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				milan_count++;
				last_scorer = "AC Milan";
				update_labels(label_result, label_last_score, label_winner);
			}
		});

		button_madrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				madrid_count++;
				last_scorer = "Real Madrid";
				update_labels(label_result, label_last_score, label_winner);
			}
		});

		panel.add(button_milan);
		panel.add(button_madrid);
		panel.add(label_result);
		panel.add(label_last_score);
		panel.add(label_winner);

		JLabel field = new JLabel();
		Timer t = new Timer(1000, new ActionListener()
		{
			int count = 10;
			@Override
			public void actionPerformed(ActionEvent e)
			{
				count--;
				if (count == 0)
				{
					button_madrid.setEnabled(false);
					button_milan.setEnabled(false);
					Timer s = (Timer)e.getSource();
					s.stop();
				}
				field.setText(String.valueOf(count));
			}
		});
		t.start();
		panel.add(field);

		frame.add(panel);
		frame.setVisible(true);
	}
}