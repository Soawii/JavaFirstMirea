package ru.mirea.task3.Task_2_1;

public class Task_2_1
{
	public static void main(String[] args)
	{
		Double a = Double.valueOf(1.25), b = Double.valueOf(2.5), c = Double.valueOf(3.0);
		Double s = Double.parseDouble("1.26");

		byte byte_d = s.byteValue();
		short short_d = s.shortValue();
		int int_d = s.intValue();
		long long_d = s.longValue();
		float float_d = s.floatValue();
		double double_d = s.doubleValue();

		System.out.println(s);

		String d = Double.toString(3.14);
		System.out.println(d);
	}
}
