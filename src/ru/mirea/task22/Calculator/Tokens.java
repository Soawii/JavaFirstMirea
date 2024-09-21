package ru.mirea.task22.Calculator;

public class Tokens
{
	static Token[] tokens = {new Operation("+", 0, true), new Operation("-", 0, true),
								new Operation("*", 1, true), new Operation("/", 1, true),
								new Operation("^", 3, false),

								new Bracket("("), new Bracket(")"),

								new Function("sin", 1), new Function("cos", 1), new Function("ln", 1),

								new Constant("PI", Math.PI), new Constant("E", Math.E),};

	static Token[] token_types = {new Operation("", 0, true),
									new Bracket(""), new MyNumber(0.0),
									new Function("", 0),
									new Constant("", 0.0)};

	static public Token getTokenType(char c)
	{
		for (int i = 0; i < token_types.length; i++)
		{
			if (token_types[i].getAllowed().indexOf(c) != -1)
			{
				return token_types[i];
			}
		}
		return null;
	}

	static public Token getToken(String name)
	{
		if (name == null) return null;
		for (int i = 0; i < tokens.length; i++)
		{
			if (name.equals(tokens[i].getName()))
				return tokens[i];
		}
		return null;
	}
}
