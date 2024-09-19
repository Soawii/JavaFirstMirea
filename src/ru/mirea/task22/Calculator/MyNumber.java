package ru.mirea.task22.Calculator;

import java.security.KeyPair;

public class MyNumber implements Token
{
	Double number;
	static String allowed_symbols = "0123456789.E";

	public String getName()
	{
		return "My Number";
	}

	public String getAllowed()
	{
		return allowed_symbols;
	}

	public String consume(String expression, int l)
	{
		boolean dot_seen = false, e_seen = false;
		int r = l;
		while (r < expression.length())
		{
			char c = expression.charAt(r);
			if (allowed_symbols.indexOf(c) == -1) break;
			if (c == '.')
			{
				if (dot_seen)
					throw new IllegalArgumentException("Invalid expression: Two or more dots in number");
				if (e_seen)
					throw new IllegalArgumentException("Invalid expression: Dot after E");
				dot_seen = true;
			}
			if (c == 'E')
			{
				if (e_seen)
					throw new IllegalArgumentException("Invalid expression: Double E");
				if (r + 1 < expression.length() && expression.charAt(r + 1) == '-')
					r++;
				e_seen = true;
			}
			r++;
		}
		return expression.substring(l, r) + "#" + r;
	}

	public MyNumber(Double number)
	{
		this.number = number;
	}


	@Override
	public String toString()
	{
		return "MyNumber {" +
				"number = " + number +
				'}';
	}
}
