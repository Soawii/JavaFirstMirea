package ru.mirea.task23.Task_3;

public class Add extends BinaryOperation implements Expression
{
    public Add(Expression l, Expression r)
    {
        super(l, r);
    }

    @Override
    public double evaluate(double x) {
        return evaluate(x, 0, 0);
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return l.evaluate(x, y, z) + r.evaluate(x, y, z);
    }
}
