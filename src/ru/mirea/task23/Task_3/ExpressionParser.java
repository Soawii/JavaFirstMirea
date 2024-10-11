package ru.mirea.task23.Task_3;

import java.util.Stack;

public class ExpressionParser
{
    public double x, y, z;

    public Expression parse(String s)
    {
        Expression e = null;
        try
        {
            e = parse_helper(new StringBuilder(s), 0, s.length() - 1);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        return e;
    }

    public void process_expressions(Stack<Expression> expressions, Stack<Character> operations)
    {
        while (!operations.isEmpty() && (operations.peek() == '*' || operations.peek() == '/'))
        {
            Character op = operations.pop();
            Expression a, b;
            b = expressions.pop();
            a = expressions.pop();
            if (op == '*')
                expressions.push(new Multiply(a, b));
            else
            {
                expressions.push(new Divide(a, b));
            }
        }
    }

    public Expression parse_helper(StringBuilder s, int l, int r)
    {
        Stack<Expression> expressions = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = l; i <= r; i++)
        {
            if (s.charAt(i) == '(')
            {
                int count = 0;
                for (int j = i; j <= r; j++)
                {
                    if (s.charAt(j) == '(')
                        count++;
                    else if (s.charAt(j) == ')')
                    {
                        count--;
                        if (count == 0)
                        {
                            Expression e = parse_helper(s, i + 1, j - 1);
                            expressions.push(e);
                            process_expressions(expressions, operations);
                            i = j;
                            break;
                        }
                    }
                }
            }
            else if (Character.isDigit(s.charAt(i)))
            {
                double number = 0;
                while (Character.isDigit(s.charAt(i)))
                {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                expressions.push(new Const(number));
                i--;
                process_expressions(expressions, operations);
            }
            else if (s.charAt(i) == 'x' || s.charAt(i) == 'y' || s.charAt(i) == 'z')
            {
                expressions.push(new Variable(s.charAt(i)));
                process_expressions(expressions, operations);
            }
            else if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
            {
                operations.push(s.charAt(i));
            }
        }

        while (!operations.isEmpty())
        {
            Character op = operations.pop();
            Expression a, b;
            b = expressions.pop();
            a = expressions.pop();
            if (op == '+')
                expressions.push(new Add(a, b));
            else
                expressions.push(new Subtract(a, b));
        }

        return expressions.peek();
    }
}
