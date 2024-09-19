package ru.mirea.task20.Task_4;

public class Calculator
{
	public static <T extends Number, V extends Number> Double sum(T l, V r)
	{
		return l.doubleValue() + r.doubleValue();
	}

	public static <T extends Number, V extends Number> Double sub(T l, V r)
	{
		return l.doubleValue() - r.doubleValue();
	}

	public static <T extends Number, V extends Number> Double mul(T l, V r)
	{
		return l.doubleValue() * r.doubleValue();
	}

	public static <T extends Number, V extends Number> Double div(T l, V r)
	{
		return l.doubleValue() / r.doubleValue();
	}
}
