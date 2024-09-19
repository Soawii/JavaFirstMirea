package ru.mirea.task7.Math;

public class MathFunc implements MathCalculable
{
	public static void main(String[] args)
	{
		MathFunc f = new MathFunc();
		System.out.println(f.abs(-2.56));
		System.out.println(f.pow(2, 4));
		System.out.println(f.circle_area(1));
		System.out.println(f.circle_len(1));
	}

	@Override
	public double pow(double number, double power)
	{
		return Math.pow(number, power);
	}

	@Override
	public double abs(double number)
	{
		return Math.abs(number);
	}

	@Override
	public double circle_len(double r)
	{
		return 2 * PI * r;
	}

	@Override
	public double circle_area(double r)
	{
		return PI * r * r;
	}
}
