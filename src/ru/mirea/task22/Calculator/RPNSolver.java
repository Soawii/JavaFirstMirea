package ru.mirea.task22.Calculator;

import java.util.ArrayList;
import java.util.Stack;

public class RPNSolver
{
	String expression;

	public RPNSolver(String expression)
	{
		this.expression = expression;
	}

	public void setExpression(String expression)
	{
		this.expression = expression;
	}

	public Double Solve()
	{
		ArrayList<Token> tokens = Tokenize();
		ArrayList<Token> RPN = getRPN(tokens);
		return solveRPN(RPN);
	}

	public ArrayList<Token> Tokenize()
	{
		ArrayList<Token> arr = new ArrayList<>();
		StringBuilder builder = new StringBuilder();

		class TokenFunctions
		{
			void addNumber()
			{
				if (!builder.isEmpty())
				{
					arr.add(new MyNumber(Double.parseDouble(builder.toString())));
					builder.setLength(0);
				}
			}
		}

		TokenFunctions functions = new TokenFunctions();
		Token currentToken = null;

		for (int i = 0; i < expression.length(); i++)
		{
			char c = expression.charAt(i);
			Token type = Tokens.getTokenType(c);
			if (type == null || currentToken == null || (!currentToken.getClass().equals(type.getClass())))
			{
				functions.addNumber();
				currentToken = type;
			}
			if (type == null)
				continue;

			String new_str = type.consume(expression, i);
			String[] split = new_str.split("#");
			builder.append(split[0]);
			i = Integer.parseInt(split[1]) - 1;

			Token temp = Tokens.getToken(builder.toString());
			if (temp != null)
			{
				arr.add(Tokens.getToken(builder.toString()));
				builder.setLength(0);
			}
			else if ((type instanceof Function) || (type instanceof Constant))
				throw new IllegalArgumentException("Invalid " + (type instanceof Function ? "function" : "constant") + " name");
		}
		functions.addNumber();
		return arr;
	}

	public ArrayList<Token> getRPN(ArrayList<Token> tokens)
	{
		Stack<Token> operation_stack = new Stack<>();
		ArrayList<Token> RPN = new ArrayList<>();

		for (Token token : tokens)
		{
			if (token instanceof MyNumber)
			{
				RPN.add(token);
			}
			else if (token instanceof Function)
			{
				operation_stack.push(token);
			}
			else if (token instanceof Operation operation)
			{
				while (!operation_stack.isEmpty() && operation_stack.peek() instanceof Operation top)
				{
					if (top.priority > operation.priority || (operation.is_left_leaning && top.priority == operation.priority))
					{
						operation_stack.pop();
						RPN.add(top);
					}
					else break;
				}
				operation_stack.push(operation);
			}
			else if (token instanceof Bracket bracket)
			{
				if (")".equals(bracket.getName()))
				{
					while (!operation_stack.isEmpty() && !("(".equals(operation_stack.peek().getName())))
					{
						Token top = operation_stack.peek();
						operation_stack.pop();
						RPN.add(top);
					}
					if (operation_stack.isEmpty())
					{
						throw new IllegalArgumentException("Wrong bracket placement");
					}
					operation_stack.pop();
					if (!operation_stack.isEmpty() && operation_stack.peek() instanceof Function)
					{
						RPN.add(operation_stack.peek());
						operation_stack.pop();
					}
				}
				else
				{
					operation_stack.push(bracket);
				}
			}
		}
		while (!operation_stack.isEmpty())
		{
			Token top = operation_stack.peek();
			operation_stack.pop();
			RPN.add(top);
		}
		return RPN;
	}

	public Double solveRPN(ArrayList<Token> RPN)
	{
		for (int i = 0; i < RPN.size(); i++)
		{
			if (RPN.get(i) instanceof Operation operation)
			{
				MyNumber a = (MyNumber)RPN.get(i - 2), b = (MyNumber)RPN.get(i - 1), c = null;
				if ("+".equals(operation.getName()))
					c = new MyNumber(a.number + b.number);
				else if ("-".equals(operation.getName()))
					c = new MyNumber(a.number - b.number);
				else if ("*".equals(operation.getName()))
					c = new MyNumber(a.number * b.number);
				else if ("/".equals(operation.getName()))
					c = new MyNumber(a.number / b.number);
				else if ("^".equals(operation.getName()))
					c = new MyNumber(Math.pow(a.number, b.number));
				RPN.remove(i - 2);
				RPN.remove(i - 2);
				RPN.remove(i - 2);
				RPN.add(i - 2, c);
				i = -1;
			}
			else if (RPN.get(i) instanceof Function f)
			{
				MyNumber a = (MyNumber)RPN.get(i - 1), ans = null;
				if ("sin".equals(f.getName()))
					ans = new MyNumber(Math.sin(a.number));
				else if ("cos".equals(f.getName()))
					ans = new MyNumber(Math.cos(a.number));
				else if ("ln".equals(f.getName()))
				 	ans = new MyNumber(Math.log(a.number));
				RPN.remove(i - 1);
				RPN.remove(i - 1);
				RPN.add(i - 1, ans);
				i = -1;
			}
		}
		if (RPN.size() > 1)
			throw new IllegalArgumentException("Wrong Number placement, for example 5PI is illegal while 5*PI is not");
		return ((MyNumber)RPN.get(0)).number;
	}
}
