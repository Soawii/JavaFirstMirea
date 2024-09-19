package ru.mirea.task22.Calculator;

public class Constant extends MyNumber
{
	public final String name;
	static String allowed_symbols = "QWERTYUIOPASDFGHJKLZXCVBNM";

	public Constant(String name, Double number)
	{
		super(number);
		this.name = name;
	}

	@Override
	public String consume(String expression, int l)
	{
		int r = l;
		while (r < expression.length())
		{
			char c = expression.charAt(r);
			if (allowed_symbols.indexOf(c) == -1) break;
			r++;
		}
		return expression.substring(l, r) + "#" + r;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getAllowed()
	{
		return allowed_symbols;
	}

	@Override
	public String toString()
	{
		return "Constant {" +
				"name = '" + name + '\'' + " value = " + number + '}';
	}
}
