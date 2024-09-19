package ru.mirea.task22.Calculator;

public class Bracket implements Token
{
	final String name;

	public String getName()
	{
		return name;
	}

	public String getAllowed()
	{
		return "()";
	}

	public Bracket(String name)
	{
		this.name = name;
	}

	public String consume(String expression, int l)
	{
		return String.valueOf(expression.charAt(l)) + "#" + (l + 1);
	}

	@Override
	public String toString()
	{
		return "Bracket {" +
				"name = '" + name + '\'' +
				'}';
	}
}
