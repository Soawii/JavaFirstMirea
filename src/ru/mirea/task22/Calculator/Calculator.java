package ru.mirea.task22.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Constants
{
	static final Color BACKGROUND = new Color(240, 240, 240);
}

class TextPanel extends JPanel implements ActionListener
{
	public JTextField txt;
	public RPNSolver solver;

	public TextPanel(RPNSolver solver)
	{
		this.solver = solver;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600, 150));
		txt = new JTextField();
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setFont(new Font("Segoe UI", Font.PLAIN, 60));
		txt.setBackground(Constants.BACKGROUND);
		txt.addActionListener(this);
		add(txt);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			solver.setExpression(txt.getText());
			String ans = solver.Solve().toString();
			txt.setText(ans);
			solver.setExpression(ans);
		}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}

class ButtonsPanel extends JPanel implements ActionListener
{
	public final int N = 5, M = 5;
	public JButton[][] buttons = new JButton[N][M];
	public TextPanel text_panel;
	public RPNSolver solver;

	public ButtonsPanel(TextPanel text_panel, RPNSolver solver)
	{
		this.text_panel = text_panel;
		this.solver = solver;

		setBackground(Constants.BACKGROUND);
		setLayout(new GridLayout(N, M));
		setPreferredSize(new Dimension(600, 500));
		setBounds(0, 100, 500, 400);

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				buttons[i][j] = new JButton("");
				if (i > 0 && j > 0 &&  j < 4 && i < 4)
					buttons[i][j] = new JButton(Integer.valueOf((i - 1) * 3 + j).toString());
				else if (i == 0 && j == 2)
					buttons[i][j] = new JButton(Integer.valueOf(0).toString());
				buttons[i][j].setFont(new Font("Segoe UI", Font.PLAIN, 34));
				buttons[i][j].addActionListener(this);
			}
		}
		buttons[0][4].setText("=");
		buttons[1][4].setText("+");
		buttons[2][4].setText("-");
		buttons[3][4].setText("*");
		buttons[4][4].setText("/");
		buttons[0][3].setText(".");
		buttons[4][1].setText("(");
		buttons[4][2].setText(")");
		buttons[4][3].setText("^");
		buttons[0][1].setText("C");
		buttons[0][0].setText("PI");
		buttons[1][0].setText("E");
		buttons[2][0].setText("ln");
		buttons[3][0].setText("sin");
		buttons[4][0].setText("cos");

		for (int i = N - 1; i >= 0; i--)
		{
			for (int j = 0; j < M; j++)
			{
				add(buttons[i][j]);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton obj = (JButton)e.getSource();
		if ("0123456789+-/*^().sincoslnEPI".contains(obj.getText()))
		{
			String text = text_panel.txt.getText();
			text_panel.txt.setText(text + obj.getText());
		}
		else if ("C".equals(obj.getText()))
		{
			text_panel.txt.setText("");
		}
		else if ("=".equals(obj.getText()))
		{
			try
			{
				solver.setExpression(text_panel.txt.getText());
				String ans = solver.Solve().toString();
				text_panel.txt.setText(ans);
				solver.setExpression(ans);
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}

public class Calculator extends JFrame
{
	public String expression;
	public RPNSolver solver;

	public Calculator()
	{
		this.solver = new RPNSolver("");
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		Color COLOR_BACKGROUND = new Color(234, 234, 234);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Calculator");
		setBackground(COLOR_BACKGROUND);

		JPanel text = new JPanel();
		text.setLayout(null);
		JPanel buttons = new JPanel();
		text.setLayout(new FlowLayout(FlowLayout.RIGHT));

		TextPanel text_panel = new TextPanel(solver);
		add(text_panel, BorderLayout.NORTH);
		add(new ButtonsPanel(text_panel, solver));
		pack();
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Constant c = new Constant("name", 12.23);
		Calculator calculator = new Calculator();
	}
}
