package ru.mirea.task23.Task_3;

public class Divide extends BinaryOperation implements Expression
{
    public Divide(Expression l, Expression r)
    {
        super(l, r);
    }

    @Override
    public double evaluate(double x, double y, double z)
    {
        double left = l.evaluate(x, y, z), right = r.evaluate(x, y, z);
        if (right == 0)
            throw new ArithmeticException("Divide by zero");
        if ((left / right > Integer.MAX_VALUE) || (left / right < Integer.MIN_VALUE))
            throw new ArithmeticException("Overflow");
        return left / right;
    }

    @Override
    public double evaluate(double x) {
        return evaluate(x, 0, 0);
    }
}
