package ru.mirea.task22.Calculator;

public class Function implements Token
{
	public final String name;
	public final int args;
	public static String allowed_symbols = "qwertyuiopasdfghjklzxcvbnm";

	public Function(String name, int args)
	{
		this.name = name;
		this.args = args;
	}

	public String consume(String expression, int l)
	{
		int r = l;
		while (r < expression.length())
		{
			char c = expression.charAt(r);
			if (allowed_symbols.indexOf(c) == -1) break;
			r++;
		}
		if (r == expression.length() || expression.charAt(r) != '(')
			throw new IllegalArgumentException("No brackets after a function call!");
		return expression.substring(l, r) + "#" + r;
	}

	public String getName()
	{
		return name;
	}

	public String getAllowed()
	{
		return allowed_symbols;
	}

	@Override
	public String toString()
	{
		return "Function{" +
				"name = '" + name + '\'' +
				", args = " + args +
				'}';
	}
}
