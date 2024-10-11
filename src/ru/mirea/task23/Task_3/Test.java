package ru.mirea.task23.Task_3;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        double x;
        System.out.print("Enter x : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();

        Expression e = new Add(
                                new Subtract(
                                    new Multiply(new Variable('x'), new Variable('x')),
                                    new Multiply(new Const(2), new Variable('x'))),
                                new Const(1));

        System.out.println(e.evaluate(x));

        Expression e2 = new Add(
                            new Multiply(
                                new Multiply(
                                    new Variable('x'),
                                    new Subtract(
                                            new Variable('y'),
                                            new Const(2))
                                    ),
                                new Variable('z')),
                            new Const(1));

        double y, z;
        System.out.print("Enter x : ");
        x = sc.nextDouble();
        System.out.print("Enter y : ");
        y = sc.nextDouble();
        System.out.print("Enter z : ");
        z = sc.nextDouble();

        System.out.println(e2.evaluate(x, y, z));

        ExpressionParser parser = new ExpressionParser();
        Expression ex2 = parser.parse("1000000*x*x*x*x*x/(x-1)");

        int SPACE = 10;
        System.out.println(String.format("%-" + SPACE + "s" + "%-" + SPACE + "s", "x", "f"));
        for (int x_ = 0; x_ <= 10; x_++)
        {
            System.out.print(String.format("%-" + SPACE + "d", x_));
            try
            {
                System.out.println(String.format("%-" + SPACE + "f", ex2.evaluate(x_)));
            }
            catch (Exception exc)
            {
                System.out.println(String.format("%-" + SPACE + "s", exc.getMessage()));
            }
        }
    }
}
