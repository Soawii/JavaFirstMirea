package ru.mirea.task22.Calculator;

public class Operation implements Token
{
	final int priority;
	final String name;
	final boolean is_left_leaning;

	public String getName()
	{
		return name;
	}

	public String getAllowed()
	{
		return "+-/*^";
	}

	public Operation(String name, int priority, boolean is_left_leaning)
	{
		this.priority = priority;
		this.name = name;
		this.is_left_leaning = is_left_leaning;
	}

	public String consume(String expression, int l)
	{
		return String.valueOf(expression.charAt(l)) + "#" + (l + 1);
	}

	@Override
	public String toString()
	{
		return "Operation {" +
				"priority = " + priority +
				", name = '" + name + '\'' +
				'}';
	}
}